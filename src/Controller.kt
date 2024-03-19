class Controlador {

    fun registrarCliente(
        nombre: String,
        apellidos: String,
        direccion: String,
        telefono: String,
        email: String
    ) {
        val cliente = Cliente(nombre, apellidos, direccion, telefono, email)

    }

    fun registrarTrabajador(
        nombre: String,
        apellidos: String,
        direccion: String,
        telefono: String,
        salario: Double,
        vehiculo: String
    ) {
        val trabajador = Trabajador(nombre, apellidos, direccion, telefono, salario, vehiculo)

    }

    fun registrarSolicitudMudanza(
        fecha: String,
        horaInicio: String,
        horaFin: String,
        origen: String,
        destino: String,
        cliente: Cliente,
        trabajador: Trabajador
    ) {
        val solicitud = SolicitudMudanza(fecha, horaInicio, horaFin, origen, destino, cliente, trabajador)

    }
}