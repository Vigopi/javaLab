importjava.util.*;
importjava.io.*;
PUBLICclassMyCopyApp1
{
PUBLICstaticVOIDmain(String[]args)throwsFileNotFoundException
{
Scannerscan=newScanner(System.in);
System.out.println("Entersourcefilename:");
Stringsource=scan.next();
System.out.println("Enterdestinationfilename:");
Stringdestination=scan.next();
try
{
FilesourceFile=newFile(source);
ScannerfileScan=newScanner(sourceFile);
FiledestinationFile=newFile(destination);
PrintWriterfileWrite=newPrintWriter(destinationFile);
while(fileScan.hasNext())
{
Stringword=newString();
Stringbuffer=fileScan.nextLine();
StringTokenizerst=newStringTokenizer(buffer);
while(st.hasMoreTokens())
{
word=st.nextToken();
for(inti=0;i<args.length;i++)
{
if(word.equals(args[i]))
{
word=word.toUpperCase();
break;
}
}
fileWrite.write(word);
}
fileWrite.write("\n");
}
fileWrite.close();
scan.close();
fileScan.close();
System.out.println("fileiscopied");
}
catch(FileNotFoundExceptione)
{
System.out.println("Exceptionoccured");
}
}
}