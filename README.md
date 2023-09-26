# Interview_DSA
how to add files on github
open git bash
//first making local repository
cd D:\interview_question\src  //i m going to the path where my .java files are located
git add . //it will add all files
git commit -m 'first commit'  //commit the changes
//local repo is created ,lets push this code to github 
//now create repo in your github account in google and copy the link then on gitbash
 git remote add origin https://github.com/NaumanWasti/Interview_DSA.git  
git remove -v //verifies remote url
git push origin main  //thats it,now look in your github,you will find all files


now for push new files again come to gitbash
git add CountInArray.java //write filename to add
git commit -m 'new files'  //commit
git push origin main //pushes the file

another option

git add . //this will add all modified files
git commit -m 'multipke files'  //commit
git push origin main //pushes the file
