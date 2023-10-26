export function countG(str){
    const str1 = str.toString()
    let count = 0
    for (let i in str1){
        if (str1[i] === "G"){
            count ++
        }
    }
    console.log(count)

}