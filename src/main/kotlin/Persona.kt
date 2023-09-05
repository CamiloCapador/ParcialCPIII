open class Persona (
    var nombre: String,
    var apellido: String,
    var identificacion: Int,
    var estadoCivil: String
) {
    open fun mostrarDetalles(){
        System.out.println("Nombre: $nombre");
        System.out.println("Apellido: $apellido");
        System.out.println("Identificacion: $identificacion");
        System.out.println("Estado Civil: $estadoCivil");
    }

}
