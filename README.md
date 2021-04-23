# crupPago
Gestión de Pagos.
El servicio constara con 5 funciones funcionalidades:
	Realizar pago: Se podrá realizar la operación de pagos.
	Cancelar pago: La función consta de cancelar de la operación pago.
	Ver pagos realizados: Se podrá ver el historial del pedido del usuario.
	Eliminar pagos: Eliminar el pago del historial del usuario.
	Conversión de divisas: El sistema podrá aceptar diferentes divisas y hacer su conversión.
Se espera que el sistema pueda ser accedido por cualquier usuario con su perfil.
Realizar pago
MÉTODO	TIPO DE DATO	VARIABLES 
<RealizarpagoRequest>
	Float
String 
String
String
String
String
String	cantidad_Total
Tipo_Pago
Numero_Tarjeta
Nombre_Dueño
Apellido_Dueño
Fecha_Expiracion
Codigo_Seguridad

<RealizarPagoResponse>
	String	Folio
<CancelarPagoRequest>
	Int 	Id
<CancelarPagoResponse>
	String	Respuesta
<BuscarPagosRequest>
	Int 	Id

<BuscarPagosResponse>
	Int
Float
String
String
String
	Id
Cantidad total
Tipo de pago
Fecha compra 
Hora de compra
<EliminarPagoRequest>
	Int 	ID
<EliminarPagoResponse>
	String	Respuesta

<RealizarPagoResponse>
<RealizarPagoRequest>
Cancelar pago
<CancelarPagoResponde>
<CancelarPagoRequest>
Ver pagos realizados 
<BucarPagosResponde>
<BuscarPagosResquest>
Eliminar pagos
<EliminarPagoResponde>
<EliminarPagoRequest>


<RealizarPagoRequest>
	 
<RealizarPagoResponse>
	 
<CancelarPagoRequest>
	 
<CancelarPago Responde >
	 
<BucarPagos Resquest >	 
<BuscarPagosResponse>
	 
<EliminarPagoRequest>	 
<EliminarPago Response>
	

