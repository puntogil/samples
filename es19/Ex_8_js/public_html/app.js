/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
console.log("Script app.js OK");

let txtElement = document.querySelector("#txtNumero");
let btnElement = document.querySelector("#btnAnalizza");
let lblElement = document.querySelector("#lblRisultato");

btnElement.onclick = onAnalizzaClick;
function onAnalizzaClick(e){
    let ris = analizza(txtElement.value);
    lblElement.innerHTML = ris;
}

function analizza(input) {
    let risultato;
    let x = parseInt(input);
    let n = 1;
    let sommaDivisori = 0;
    while (n < x) {
        if (x % n == 0) {
            sommaDivisori += n;
        }
        n++;
    }
    
    <!--console.log("Somma divisori", sommaDivisori,"x", x);-->
    
    if(sommaDivisori === x){
        risultato = "perfetto";
    } else if (sommaDivisori > x){
        risultato = "abbondante";
    } else {
        risultato = "difettivo";
    }
    return risultato;
}
