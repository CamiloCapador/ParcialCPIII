import java.time.format.DateTimeFormatter

class PersonalServicio (
    nombre: String,
    apellido: String,
    identificacion: Int,
    estadoCivil: String,
    fechaIncorporacion: String,
    numeroDespacho: Int,
    var seccion: String
): Empleado (nombre, apellido, identificacion, estadoCivil, fechaIncorporacion, numeroDespacho) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Seccion: $seccion")
    }
}