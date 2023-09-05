import java.time.format.DateTimeFormatter
class Profesor(
    nombre: String,
    apellido: String,
    identificacion: Int,
    estadoCivil: String,
    fechaIncorporacion: String,
    numeroDespacho: Int,
    var departamento: String
): Empleado (nombre, apellido, identificacion, estadoCivil, fechaIncorporacion, numeroDespacho) {
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Departamento al que pertenece: $departamento")
    }
}