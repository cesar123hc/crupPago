var mensaje = '';
function ini(){
    mensaje='<?xml version="1.0" encoding="utf-8"?>' +
    '<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">' +
    '<Body>' +
    '<CancelarPagoRequest xmlns="http://tell.me/pago">' +
    '<id>'+ document.getElementById('id_pedido').value +'</id>' +
    '</CancelarPagoRequest>' +
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
    document.getElementById('Respuesta').value= resultado(response.data)

       var valor= resultado(response.data)
       console.log(valor);
    })
    .catch(err => console.log(err));
}
function resultado(rXml){
    
    var parser = new DOMParser();
    var xmlDoc= parser.parseFromString(rXml, "text/xml");
    var resul= xmlDoc.getElementsByTagName("ns2:respuesta")[0].childNodes[0].nodeValue;
    alert(resul);
    window.location.href = "menu.html";
    
    
 
    
    console.log(res);
    
}