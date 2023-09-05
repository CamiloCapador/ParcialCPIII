fun main(args: Array<String>) {
    //Juan Camilo Garzon Capador
    println("Parcial 1 CPIII")

    val estudiante1 = Estudiante ("Camilo", "Garzon", 10035453, "Soltero", "Ingenieria de sistemas");
    val estudiante2 = Estudiante ("Juan", "Perez", 1003456, "Soltero", "Ingenieria de sistemas");
    val profesor1 = Profesor ("Carlos", "perez", 234352435, "Casado", "01-23-2010", 5, "Ingenieria");
    val profesor2 = Profesor ("Lorena", "Santana", 10732432, "Soltera","02-12-2020",6, "Lenguajes");
    val personaServicio1 = PersonalServicio ("Paola", "Sanchez", 10045435, "Soltera", "31-12-2009", 4, "Biblioteca");
    val personaServicio2 = PersonalServicio ("Tatiana", "Rodriguez", 10012356, "Soltera", "31-12-2009", 4, "Biblioteca");

    var lstEstudiante = arrayListOf<Estudiante>()
    lstEstudiante.add(estudiante1)
    lstEstudiante.add(estudiante2)

    var lstProfesor = arrayListOf<Profesor>()
    lstProfesor.add(profesor1)
    lstProfesor.add(profesor2)

    var lstPersonalServicio = arrayListOf<PersonalServicio>()
    lstPersonalServicio.add(personaServicio1)
    lstPersonalServicio.add(personaServicio2)


    var opc = 0
    while (opc != 7) {

        println(
            """
            
        1. Cambio del estado civil de una persona.
        2. Reasignación de despacho a un empleado.
        3. Matricula de un estudiante en un nuevo curso.
        4. Cambio de departamento de un profesor.
        5. Traslado de sección de un empleado del personal de servicio.
        6. Imprimir toda la información de cada tipo de individuo
        7. Salir
        
        Digite opcion: 
        """.trimIndent()
        )

        opc = readln().toInt()

        when (opc) {
            1 -> {}
            2 -> {}
            3 -> {}
            4 -> {}
            5 -> {}
            6 -> {
                println("\nInformacion Estudiantes: ")
                lstEstudiante.forEach{
                    println("""      
            
                Nombre: ${it.nombre}
                Apellido: ${it.apellido}
                Identificación: ${it.identificacion}
                Estado civil: ${it.estadoCivil}
                Curso: ${it.curso}
                
            """.trimIndent())
                }

                println("Informacion Profesores: ")
                lstProfesor.forEach{
                    println("""      
            
                Nombre: ${it.nombre}
                Apellido: ${it.apellido}
                Identificación: ${it.identificacion}
                Estado civil: ${it.estadoCivil}
                Fecha Incorporación: ${it.fechaIncorporacion}
                Número de Despacho: ${it.numeroDespacho}
                Departamento: ${it.departamento}
                
            """.trimIndent())
                }

                println("Informacion Personal de Sericio: ")
                lstPersonalServicio.forEach{
                    println("""      
            
                Nombre: ${it.nombre}
                Apellido: ${it.apellido}
                Identificación: ${it.identificacion}
                Estado civil: ${it.estadoCivil}
                Fecha Incorporación: ${it.fechaIncorporacion}
                Número de Despacho: ${it.numeroDespacho}
                Sección: ${it.seccion}
                
            """.trimIndent())
                }
            }
            7-> println("Adios")
            else-> println("\nOpcion incorrecta")
        }
    }
}