function sorting(array)
{
    for (let i = 0; i < array.length-1; i++) 
    {
        for (let j = i+1; j < array.length; j++) 
        {
            if(array[i]<array[j])
            {
                const temp=array[i];
                array[i]=array[j]
                array[j]=temp;
            }
            
        }
    }
        return array;
        
    }

const array = [1,3,5,7,6,2,4]
console.log(sorting(array))