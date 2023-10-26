export function arrayFiltering(array,test){
    let ls =[]
    for (let i = 1; i<=array.length+1;i++){
        if (test(i) == true){
            ls.push(i)
        }
    }
    return ls
}