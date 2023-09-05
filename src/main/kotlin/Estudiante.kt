class Estudiante(
    nombre: String,
    apellido: String,
    identificacion: Int,
    estadoCivil: String,
    var curso: String
): Persona (nombre, apellido, identificacion, estadoCivil){
    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Curso Matriculado: $curso")
    }
}