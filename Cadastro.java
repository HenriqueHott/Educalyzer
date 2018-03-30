import java.io.*;
import java.util.*;

class Sistema
{
	//Atributos
	private String nome;
	private String usuario;
	private String senha;
	private String email;
	private int id;

	//Construtores
	public Sistema()
	{
		nome = "";
		usuario = "";
		senha = "";
		email = "";
		id = 0;
	}

	//Setters
	private void setNome(String nome)
	{
		if(nome != null)
		{
			this.nome = nome;
		}
	}

	private void setUsuario(String usuario)
	{
		if(usuario != null)
		{
			this.usuario = usuario;
		}
	}

	private void setSenha(String senha)
	{
		if(senha != null)
		{
			this.senha = senha;
		}
	}

	private void setEmail(String email)
	{
		if(email != null)
		{
			this.email = email;
		}
	}

	private void setId(int id)
	{
		this.id = id;
	}


	public void registrar()
	{
		//definir dados
		BufferedWriter arq;
		Scanner sc = new Scanner(System.in);
		String nome,usuario,email,senha;



		try
		{
			arq = new BufferedWriter(new FileWriter("dados.txt",true));

			//ler nome
			System.out.print("Nome: ");
			nome = sc.nextLine();

			//verificar se nome valido
			while(nome == null)
			{
				System.out.println("Nome invalido !");
				System.out.print("Nome: ");
				nome = sc.nextLine();
			}

			//ler usuario
			System.out.print("Usuario: ");
			usuario = sc.nextLine();

			//verificar se ja possue esse nome
			/*
				...
			*/

			//ler email
			System.out.print("Email: ");
			email = sc.nextLine();

			//verificar se email valido
			while(email == null || !(email.contains("@")))
			{
				System.out.println("Email invalido !");
				System.out.print("Email: ");
				email = sc.nextLine();
			}


			//ler senha
			System.out.print("Senha: ");
			senha = sc.nextLine();

			//verificar se senha valida
			while(senha == null)
			{
				System.out.println("Senha invalida !");
				System.out.print("Senha: ");
				senha = sc.nextLine();
			}

			while(senha.length() < 6)
			{
				System.out.println("Senha deve ter no minimo 6 caracteres !");
				System.out.print("Senha: ");
				senha = sc.nextLine();
			}


			//setar os atributos
			setNome(nome);
			setUsuario(usuario);
			setEmail(email);
			setSenha(senha);
			setId(id + 1);

			//Salvar dados em arquivo
//			arq.write(id + ":" + nome + ":" + usuario + ":" + email + ":" + senha);
			arq.write(nome + ":" + usuario + ":" + email + ":" + senha);
			arq.write("");

			//fechar arquivo
			arq.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}

public class Cadastro
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Sistema s = new Sistema();

	
		System.out.println("0 - Fechar");
		System.out.println("1 - Registrar");
		System.out.println("2 - Login");
		System.out.print("Escolha uma opção: ");
		int opcao = sc.nextInt();

		while(opcao != 0)
		{
			if(opcao == 1)
			{
				s.registrar();
			}


			System.out.println("0 - Fechar");
			System.out.println("1 - Registrar");
			System.out.println("2 - Login");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
		}

	}
}