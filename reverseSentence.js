function reverseWords(sentence)
{
    //split the sentence into words
   const words = sentence.split(' ') 

   //iterate through words and reverseeach one

  for (let index = 0; index < words.length; index++)
   {
    words[index] = words[index].split("").reverse().join("");  
   }

   //join the reversed words back into a sentence
   const reversedSentence = words.join(' ');
   return reversedSentence;
}

const sentence = "my name is rahul";
console.log(sentence);
const reversedResult = reverseWords(sentence);
console.log(reversedResult);



