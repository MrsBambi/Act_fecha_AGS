/**
 * Fecha
 *
 * @property dia
 * @property mes
 * @property anio
 * @constructor Create empty Fecha
 */
class Fecha(private val dia: Int, private val mes: Int, private val anio: Int) {

    /**
     * Valida
     * Si la fecha es valida o no
     * @return true o false
     */
    fun valida(): Boolean {
        var esValida = false

        if ((dia >= 1 || dia <= 31) && (mes >=1  && mes <= 12)) {
            var diasMes = diasdelMes(mes)
            esValida = dia <= diasMes
        }

        // determinamos la cantidad de días del mes:
        return esValida
    } // … más métodos

    private fun esBisiesto(a: Int) : Boolean {
        return (a % 400 == 0 || a % 4 == 0  && a % 100 != 0)
    }

    /**
     * Dias del mes
     * Comprueba di el dia introducido es valido
     * @return true o false
     */
    private fun diasdelMes (mes : Int) : Int {
        var diasMes = 0
        when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> if(esBisiesto(anio)) 29 else 28
        }
        return diasMes
    }
}
