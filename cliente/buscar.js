var mensaje = '';
    function ini(){
        mensaje='<?xml version="1.0" encoding="utf-8"?>' +
        '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
        '<Body>' +
        '<BuscarPagosRequest xmlns="http://tell.me/pago">' +
        '<id>'+ document.getElementById('id_pedido').value +'</id>' +
        '</BuscarPagosRequest>' +
        '</Body>' +
        '</Envelope>';
    }

    function soap() {
        // alert('hola')
        ini();
        axios.post('http://localhost:8080/ws/pago',mensaje,{
            headers:{
                'Content-Type' : 'text/xml'
            }
        })
        .then(function (response){
            document.getElementById('resultado').value= resultado(response.data)
        })
        .catch(err => console.log(err));
    }
    function resultado(rXml){
        var parser = new DOMParser();
        var xmlDoc= parser.parseFromString(rXml, "text/xml");
        var id= xmlDoc.getElementsByTagName("id")[0];
        var cantidadtotal= xmlDoc.getElementsByTagName("cantidad_Total")[1];
        var tipo= xmlDoc.getElementsByTagName("tipo_Pago")[2];
        var fecha= xmlDoc.getElementsByTagName("fecha_Compra")[3];
        var hora= xmlDoc.getElementsByTagName("hora_Compra")[4];
        var resul =tipo+fecha+hora;
        return resul;
    }