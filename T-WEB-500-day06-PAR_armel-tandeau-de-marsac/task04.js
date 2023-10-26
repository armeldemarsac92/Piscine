export function fizzBuzz(num){
    let ls = []
    if (typeof(num)==="number"){
        for (let i = 1; i < num+1; i++){
            if (i%3 === 0){
                ls.push("Fizz")
            }
            if ((i%5 === 0)&&(i%3 != 0)){
                ls.push("Buzz")
            }
            if ((i%5 === 0)&&(i%3 === 0)){
                ls.push("FizzBuzz")
            }
            if ((i%5 != 0)&&(i%3 !=0)){
                ls.push(i)
            }
        }
        console.log(ls.toString())
    }
}