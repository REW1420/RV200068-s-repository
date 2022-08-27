fun main(args: Array<String>) {


        var nu1: Int = 0
        var nu2: Int = 0
        var nu3: Int = 0



        println("Ingrese el primer numero")
        nu1= readLine()!!.toInt();

        println("Ingrese el segundo numero")
        nu2= readLine()!!.toInt();

        println("Ingrese el tercer numero")
        nu3= readLine()!!.toInt();

        println(nuEntro(nu1, nu2, nu3))
        println(igualdadnu(nu1, nu2, nu3))

        println("Primer numero: $nu1")
        println("Segundo numero: $nu2")
        println("Tecero numero: $nu3")

        println("Numero mayor :"+comprobarMayor(nu1,nu2,nu3)+"+ 10 "+" = "+(comprobarMayor(nu1,nu2,nu3)+10))
        println("Numero menor :"+comprobarMenor(nu1,nu2,nu3)+"- 5 "+" = "+(comprobarMenor(nu1,nu2,nu3)-5));

    }fun igualdadnu(nu1:Int, nu2:Int, nu3:Int): String {

        var desigual: String = ""

    if (nu1 == nu2){
        desigual ="El primer numero es igual al segundo"
    };if (nu1==nu3){
        desigual ="El primer numero es igual al tercero"
    };if (nu2==nu3) {
        desigual ="El segundo numero es igual al tercero"

    }
    return desigual;
    }

    fun comprobarMayor (nu1: Int, nu2: Int, nu3: Int): Int {
        var numayor: Int =0

        if (nu1>nu2 && nu1>nu3){
            numayor=nu1;
        };if (nu2>nu1 && nu2>nu3){
            numayor=nu2
        };if (nu3>nu1 && nu3>nu2){
            numayor=nu3
        }
        return numayor
    }fun comprobarMenor (nu1: Int, nu2: Int, nu3: Int): Int {
        var numenor: Int = 0

        if (nu1<nu2 && nu1<nu3){
            numenor=nu1;
        };if (nu2<nu1 && nu2<nu3){
            numenor=nu2
        };if (nu3<nu1 && nu3<nu2){
            numenor=nu3
        }
        return numenor
    }fun nuEntro(nu1:Int, nu2:Int, nu3:Int): String {
    var mensaje: String = ""


    if ((nu1 % 2) != 2) {
         mensaje="El primer numero no es entero"
    };if ((nu2 % 2) != 2) {
        mensaje="El segundo numero no es entero"
    };if ((nu3 % 2) != 2) {
        mensaje="El tercer numero no es entero"
    };if ((nu1 % 2) == 2) {
        mensaje=""
    };if ((nu2 % 2) == 2) {
        mensaje=""
    };if ((nu3 % 2) == 2) {
        mensaje=""
    }

    return mensaje

}
