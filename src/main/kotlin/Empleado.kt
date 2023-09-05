import java.time.format.DateTimeFormatter
open class Empleado (
    nombre: String,
    apellido: String,
    identificacion: Int,
    estadoCivil: String,
    var fechaIncorporacion: String,
    var numeroDespacho: Int
): Persona (nombre, apellido, identificacion, estadoCivil){
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Fecha Incorporación: $fechaIncorporacion")
        println("Número de Despacho: $numeroDespacho")
    }
}



