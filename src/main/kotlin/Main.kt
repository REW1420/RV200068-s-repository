fun main(args: Array<String>) {
    var nu1: Double = 0.0
    var nu2: Double = 0.0
    var nu3: Double = 0.0



    println("Ingrese el primer numero")
    nu1= readln().toDouble();

    println("Ingrese el segundo numero")
    nu2= readln().toDouble();

    println("Ingrese el tercer numero")
    nu3= readln().toDouble();


    if ((nu1%1)!=0.0){
        println("el primer numero no es entero")
    } ;if ((nu2%1)!=0.0){
        println("el segundo numero no es entero")
    };if ((nu3%1)!=0.0){
        println("el tercero numero no es entero")
    }else{
        println("Todos son enteros")
    }

    ;if (nu1 == nu2 || nu1 == nu3 || nu2==nu3){
        println("Hay un numero repetido")
    }else{
        println("Todos son diferentes")
    }

    ;if ((nu1%5)!=0.0){
        println("El primer numero no es multiplo de 5")
    };if ((nu2%5)!=0.0){
        println("El primer numero no es multiplo de 5")
    };if ((nu3%5)!=0.0){
        println("El primer numero no es multiplo de 5")
    }else{
        println("Todos son multiplos de 5")
    }

    println("Primer numero: $nu1")
    println("Segundo numero: $nu2")
    println("Tecero numero: $nu3")

    if (mayor(nu1,nu2,nu3)>10){

        println("Mayor = "+(mayor(nu1,nu2,nu3)+10))

    }
    if (menor(nu1,nu2,nu3)>50){

        println("Menor = "+(menor(nu1,nu2,nu3)-5))

    }

}fun mayor (nu1: Double, nu2: Double, nu3: Double): Double {
    var numayor: Double =0.0

    if (nu1>nu2 && nu1>nu3){
        numayor=nu1;
    };if (nu2>nu1 && nu2>nu3){
        numayor=nu2
    };if (nu3>nu1 && nu3>nu2){
        numayor=nu3
    }
    return numayor
}fun menor (nu1: Double, nu2: Double, nu3: Double): Double {
    var numenor: Double = 0.0

    if (nu1<nu2 && nu1<nu3){
        numenor=nu1;
    };if (nu2<nu1 && nu2<nu3){
        numenor=nu2
    };if (nu3<nu1 && nu3<nu2){
        numenor=nu3
    }
    return numenor
}


