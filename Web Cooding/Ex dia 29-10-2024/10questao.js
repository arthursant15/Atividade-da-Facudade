function calcularHipotenusa(cat1, cat2){
    let soma = Math.pow(cat1,2) + Math.pow(cat2, 2)
    let hipotenusa = Math.sqrt(soma)
    return hipotenusa
}

let resultado = calcularHipotenusa(100,12)

console.log(resultado);
