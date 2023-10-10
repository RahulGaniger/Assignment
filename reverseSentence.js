function reverseWords(sentence)
{
    //split the sentence into words
   const words = sentence.split(' ') 

   //iterate through words and reverseeach one

   const reverse = words.map(word =>{
    return word.split('').reverse().join('');
   });

   //join the reversed words back into a sentence

   const reversedSentence = reverse.join(' ');
   return reversedSentence;
}

const sentence = "my name is rahul";
console.log(sentence);
const reversedResult = reverseWords(sentence);
console.log(reversedResult);

