var mensaje="";
function ini(){

   
        mensaje='<?xml version="1.0" encoding="utf-8"?>' +
        '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
        '<Body>' +
        '<RealizarPagoRequest xmlns="http://tell.me/pago">' +
        '<cantidad_Total>'+ document.getElementById('total').value +'</cantidad_Total>' +
        '<tipo_Pago>'+ document.getElementById('tipoPago').value +'</tipo_Pago>' +
        '<numero_Tarjeta>'+document.getElementById('numeroTarjeta').value+'</numero_Tarjeta>'+
        '<nombre_Dueno>' +document.getElementById('nombre').value+'</nombre_Dueno>'+
        '<apellido_Dueno>'+document.getElementById('apellido').value+'</apellido_Dueno>'+
        '<fecha_Expiracion>' +document.getElementById('fechaExpiracion').value+ '</fecha_Expiracion>'+
        '<codigo_Seguridad>'+document.getElementById('codigoSeguridad').value+'</codigo_Seguridad>'+
        '</RealizarPagoRequest>' +
        '</Body>' +
        '</Envelope>';
    
}


function soap() {
    
    ini();
    axios.post('http://localhost:8080/ws/pago',mensaje,{
        headers:{
            'Content-Type' : 'text/xml'
        }
    })
    .then(function (response){
        document.getElementById('r').value= resultado(response.data)
    })
    .catch(err => console.log(err));
}

function resultado(rXml){
    var parser = new DOMParser();
    var xmlDoc= parser.parseFromString(rXml, "text/xml");
    var resul= xmlDoc.getElementsByTagName("ns2:folio_Pago")[0].childNodes[0].nodeValue;
    alert('PAGO CON ÉXITO, FOLIO'+resul);
    return resul;
}

function myFunction() {
  alert("I am an alert box!");
}