import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Loja {

	public static void main(String[] args) {

		/*
		 * BufferedReader aluno; String nome;
		 * 
		 * try {
		 * 
		 * aluno = new BufferedReader( new FileReader("aluno.zip"));
		 * 
		 * System.out.println(aluno.readLine());
		 * 
		 * 
		 * } catch (IOException e) {
		 * 
		 * } }
		 */

		BufferedWriter aluno;

		try {

			aluno = new BufferedWriter(new FileWriter("aluno.zip"));

			aluno.write("crismaikon maciel lins");

			aluno.close();

		} catch (IOException e) {
			System.out.println(e);
		}

		BufferedReader ler;

		try {

			ler = new BufferedReader(new FileReader("aluno.zip"));
			
			System.out.println(ler.readLine());

			ler.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
