open class Persona(
    val nombre: String,
    val apellidos: String,
    val direccion: String,
    val telefono: String
) {

    override fun toString(): String {
        return "$nombre $apellidos\n$direccion\n$telefono"
    }
}