package com.example.crudPago;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import me.tell.pago.BuscarPagosRequest;
import me.tell.pago.BuscarPagosResponse;
import me.tell.pago.CancelarPagoRequest;
import me.tell.pago.CancelarPagoResponse;
import me.tell.pago.EliminarPagoRequest;
import me.tell.pago.EliminarPagoResponse;
import me.tell.pago.RealizarPagoRequest;
import me.tell.pago.RealizarPagoResponse;

@Endpoint
public class PagoEndPoint {
    @Autowired
    private CrudPago crudPago;

    @PayloadRoot(namespace = "http://tell.me/pago", localPart = "RealizarPagoRequest")

    @ResponsePayload
    public RealizarPagoResponse damePago( @RequestPayload RealizarPagoRequest peticion){
        RealizarPagoResponse respuesta=new RealizarPagoResponse();
        //respuesta.setRespuesta("contenidospara pago "+peticion.getId());
        
        //Crear un pago
        Pago pago= new Pago();
        pago.setCantidadTotal(peticion.getCantidadTotal());
        pago.setTipoPago(peticion.getTipoPago());
        pago.setNumeroTarjeta(peticion.getNumeroTarjeta());
        pago.setNombreDueno(peticion.getNombreDueno());
        pago.setApellidoDueno(peticion.getApellidoDueno());
        pago.setFechaExpiracion(peticion.getFechaExpiracion());
        pago.setCodigoSeguridad(peticion.getCodigoSeguridad());
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        pago.setFechaCompra(formateador.format(ahora).toString());
        Date ahora2 = new Date();
        SimpleDateFormat formateador2 = new SimpleDateFormat("hh:mm:ss");
        pago.setHoraCompra(formateador2.format(ahora2).toString());
        pago.setEstatusPago("realizado");
        
        //guardar con ayuda del crud
        pago.setFolio_Pago(String.valueOf(ThreadLocalRandom.current().nextInt(1000, 9998 + 1)));
        crudPago.save(pago);
        respuesta.setFolioPago(String.valueOf(ThreadLocalRandom.current().nextInt(1000, 9998 + 1)));
       
        //.setId(pago.getId());
        return respuesta;
    }
    @PayloadRoot(namespace = "http://tell.me/pago", localPart = "CancelarPagoRequest")
    
    @ResponsePayload
    public CancelarPagoResponse cancelarPago( @RequestPayload CancelarPagoRequest peticion){
        CancelarPagoResponse respuesta= new CancelarPagoResponse();
        
        if(crudPago.existsById(peticion.getId())){ 
            Pago pagoCancelar= new Pago();
            Optional<Pago> pagoAcancelar= crudPago.findById(peticion.getId());
            if(pagoAcancelar.isPresent()){
                pagoCancelar= pagoAcancelar.get();
                pagoCancelar.setEstatusPago("Cancelado");
                crudPago.save(pagoCancelar);
            }
            respuesta.setRespuesta("Su pago ha sido CANCELADO correctamente");
        }else{
            respuesta.setRespuesta("Pago NO encontrado");
        }
          
        return respuesta;
    }
    
    @PayloadRoot(namespace = "http://tell.me/pago", localPart = "EliminarPagoRequest")

    @ResponsePayload
    public EliminarPagoResponse wliminarPago( @RequestPayload EliminarPagoRequest peticion){
            EliminarPagoResponse respuesta =new EliminarPagoResponse();
            int id =peticion.getId();
            Pago pago=crudPago.findById(id).orElse(null);
            crudPago.delete(pago);
            respuesta.setRespuesta("El pago con ID="+id+" ha sido eliminado");
        return respuesta;
    }
    @PayloadRoot(namespace = "http://tell.me/pago", localPart = "BuscarPagosRequest")
    @ResponsePayload
    public BuscarPagosResponse buscarPagos( @RequestPayload BuscarPagosRequest peticion){
        BuscarPagosResponse respuesta= new BuscarPagosResponse();
        
        
        if(crudPago.existsById(peticion.getId())){
            Pago pagoBuscar= new Pago();
            Optional<Pago> pagoRec= crudPago.findById(peticion.getId());
            if(pagoRec.isPresent()){
                pagoBuscar=pagoRec.get();

                respuesta.setId(pagoBuscar.getId());
                respuesta.setCantidadTotal(pagoBuscar.getCantidadTotal());
                respuesta.setTipoPago(pagoBuscar.getTipoPago());
                respuesta.setFechaCompra(pagoBuscar.getFechaCompra());
                respuesta.setHoraCompra(pagoBuscar.getHoraCompra());
               
            }else{
                return respuesta;
            }
        }
        return respuesta;
    }
}