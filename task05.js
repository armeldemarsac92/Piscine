export function range(start, end, step=1){
    let rng = []
    if (Number.isInteger(start) && Number.isInteger(end) && Number.isInteger(step)){
        if ((start < end)&&(step>0)){
            for (let i=start; i<=end; i+=step){
                rng.push(i)
            }
            return rng
        }

        if ((start > end)&&(step<0)){
            for (let i=start; i>=end; i+=step){
                rng.push(i)
            }
            return rng

        }

        else {
            return rng
        }
    }

    else {
        return rng
    }   

}