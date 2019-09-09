using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ExercisesProject.Exercises
{
    // 0117 - Remove vowels
    class RemoveVowels_Demo
    {
        //static void Main(string[] args)
        public static void Run ()
        {
            Console.WriteLine("0117 - RemoveVowels_Demo");
            Console.WriteLine();

            string text = "Hello world!";

            Console.WriteLine("Original text: {0}", text);

            Console.WriteLine("Remove vowels v1: {0}", RemoveVowels_V1(text) );
            Console.WriteLine("Remove vowels v2: {0}", RemoveVowels_V2(text) );
            Console.WriteLine("Remove vowels v3: {0}", RemoveVowels_V3(text));

            Console.ReadKey();
        }

        static string RemoveVowels_V1 ( string text )
        {
            StringBuilder result = new StringBuilder();

            foreach( char c in text )
            {
                if ( !"aeiou".Contains( c.ToString().ToLower() ))
                {
                    result.Append(c);
                }
            }

            return result.ToString();
        }

        static string RemoveVowels_V2 ( string text )
        {
            string result = string.Empty;

            var withoutVowels =
                text.
                Where(c => !"aeiou".Any(x => x.ToString() == c.ToString().ToLower()));

            result = string.Concat(withoutVowels);

            return result;
        }

        static string RemoveVowels_V3(string text)
        {
            string result = string.Empty;

            var withoutVowels =
                text.
                Where( c => 
                    "aeiou".IndexOfAny(c.ToString().ToLower().ToCharArray()) == -1 );

            result = string.Concat(withoutVowels);

            return result;
        }
    }
}
