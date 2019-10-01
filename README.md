# AadhyaBhatt
Computer programs for the Substitution Cipher based on Z29 which is corresponding to 26 alphabetic characters (0 - 25), space (26), and “, ” (27) “.”(28). The key is a random permutation π on Z29. Write down encryption and decryption programs. Select a paragraph of text (I don’t think any two people will choose a same paragraph if they choose independently) and encrypt it using your encryption algorithm. Then use your decryption program to check the correctness. 

Solution Description: 
For the program  jdk complier is used for compiling the substitution cipher and have executed the Substitution cipher using java programing language, in eclipse IDE.
STEP1: In main we have  shuffled (randomly) to produced a key. We have substituted every plain character (a -z) including space, comma and single cots for a different ciphertext character. We have even excuted all the print statements in the main function including encryption and decryption.
STEP2: In the encryption function we have encrypted the extracted the cipher text and performed encryption algorithm on it. We encrypt the cipher till the end of the character. This produces the encrypted cipher (in string).
STEP 3: As soon as we get the encrypted cipher we used decryption function to go from the cipher text back to the plain text. Matching the value of key with cipher text (in string).
STEP 4: In the shuffle function we have performed basic swap operation on the array. For number of itergation generated random value using array and key.

FUNCTIONS USED:  
There are three main functions used while computing this substitution cipher code.
1.	Encryption function – If the key emement is present then it will store in the index of the array and perform encryption opertaion.
2.	Decryption function – It will store the value in the index from the array if the key element is present in the array. It will decrypt all the characters using incremental approach.
3.	Shuffle function – The shuffle array function is responsible for swapping the key based on matching the key with the cipher text.
