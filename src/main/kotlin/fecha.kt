/**
 * Fecha
 *
 * @property dia
 * @property mes
 * @property a
 * @constructor Create empty Fecha
 */
class Fecha(private val dia: Int, private val mes: Int, private val a: Int) {

    /**
     * Valida
     * Si la fecha es valida o no
     * @return true o false
     */
    fun valida(): Boolean {

        if (dia < 1 || dia > 31) return false
        if (mes < 1 || mes > 12) return false

        // determinamos la cantidad de días del mes:
        return diasdelMes()
    } // … más métodos

    /**
     * Dias del mes
     * Comprueba di el dia introducido es valido
     * @return true o false
     */
    fun diasdelMes () : Boolean {
        var diasMes = 0
        when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> diasMes = 31
            4, 6, 9, 11 -> diasMes = 30
            2 -> diasMes = if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) 29 else 28
        }
        return if (dia > diasMes) false else true
    }
}
