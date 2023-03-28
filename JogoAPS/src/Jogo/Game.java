package Jogo;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private String Player, redClass, blueClass, redHero, blueHero;
	private static int redLife, blueLife;
	
	void red(String redNome, String redClasse, int redVida){
		Player = redNome;
		redClass = redClasse;
		redLife = redVida;
	}
	
	void blue(String blueNome, String blueClasse, int blueVida){
		Player = blueNome;
		blueClass = blueClasse;
		blueLife = blueVida;
	}
	static void agradecimento() {
		System.out.println("\n\n\n\n\n");
		System.out.println("========================================================================================");
		System.out.println("Muito obrigado por utilizar nosso jogo.");
		System.out.println("Espero que tenha se divertido.");
	}
	public class TesteGame {
		@SuppressWarnings("unused")
		public static void main(String[] args) throws InterruptedException {
			
			Game player1 = new Game();
			Game player2 = new Game();
			Scanner input = new Scanner(System.in);
			Random random = new Random();
			
			List<String> redCards = new ArrayList<String>();
			List<String> blueCards = new ArrayList<String>();
			
			boolean redTurn = false, blueTurn = false;
			
			redLife = 20;
			blueLife = 20;
			
			System.out.println("Welcome to the Hearthstone \nBy Renan \n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
			Thread.sleep(1000);
			
			System.out.println("Trata-se de um jogo de cartas, time vermelho x time azul.\n"
					+ "Cada jogador escolhará sua classe e seu herói.\n"
					+ "Cada jogador terá 20 pontos de vida e receberá 5 cartas aleatórias, de acordo com a sua classe.\n"
					+ "Quem derrotar o outro primeiro ganha.\n \n"
					+ "Obs: algumas classes possuem vantagens contra outras classes.\n");
			Thread.sleep(4000);
			
			
			player1.Player = JOptionPane.showInputDialog("Jogador vermelho, qual é o seu nome:");
			Thread.sleep(500);
			player2.Player = JOptionPane.showInputDialog("Jogador azul, qual é o seu nome:");
			Thread.sleep(500);
			
			
			// Red Team Classe e Herói
			
			while (player1.redClass == null || player1.redClass == "Escolha um") {
				String[] classes = {
						"Escolha um",
						"Cavaleiro",
						"Arqueiro",
						"Mago",
						"Assassino"
				};
				player1.redClass = (String) JOptionPane.showInputDialog(null, player1.Player + ", escolha sua classe:", "Red Class", JOptionPane.QUESTION_MESSAGE, null, classes, classes[0]);
				if(player1.redClass == null || player1.redClass == "Escolha um") {
					System.err.println(player1.Player + " não escolheu uma classe.");
				}
				
				// ======== Cavaleiro ========
				else if(player1.redClass == "Cavaleiro") {
					String alternateClassResponse = null;
					while (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
						String[] alternateClassOps = {
								"Escolha um",
								"Garrosh Hellscream",
								"Magni Bronzebeard"
						};
						Thread.sleep(500);
						alternateClassResponse = (String) JOptionPane.showInputDialog(null, player1.Player + ", qual herói você quer ser?", "Red Hero", JOptionPane.QUESTION_MESSAGE, null, alternateClassOps, alternateClassOps[0]);
						if (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
							System.out.println(player1.Player + " não escolheu um herói.");
						} else {
							player1.redHero = alternateClassResponse;
							redCards.add("Carta1");
							redCards.add("Carta2");
							redCards.add("Carta3");
							redCards.add("Carta4");
							redCards.add("Carta5");
						}
					}
				}
				
				// ======== Arqueiro ========
				else if(player1.redClass == "Arqueiro") {
					String alternateClassResponse = null;
					while (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
						String[] alternateClassOps = {
								"Escolha um",
								"Night elf",
								"Sylvanas Windrunner"
						};
						Thread.sleep(500);
						alternateClassResponse = (String) JOptionPane.showInputDialog(null, player1.Player + ", qual herói você quer ser?", "Red Hero", JOptionPane.QUESTION_MESSAGE, null, alternateClassOps, alternateClassOps[0]);
						if (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
							System.out.println(player1.Player + " não escolheu um herói.");
						} else {
							player1.redHero = alternateClassResponse;
							redCards.add("Carta1");
							redCards.add("Carta2");
							redCards.add("Carta3");
							redCards.add("Carta4");
							redCards.add("Carta5");
						}
					}
				}
				
				// ======== Mago ========
				else if(player1.redClass == "Mago") {
					String alternateClassResponse = null;
					while (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
						String[] alternateClassOps = {
								"Escolha um",
								"Becky Dawson",
								"Landazar"
						};
						Thread.sleep(500);
						alternateClassResponse = (String) JOptionPane.showInputDialog(null, player1.Player + ", qual herói você quer ser?", "Red Hero", JOptionPane.QUESTION_MESSAGE, null, alternateClassOps, alternateClassOps[0]);
						if (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
							System.out.println(player1.Player + " não escolheu um herói.");
						} else {
							player1.redHero = alternateClassResponse;
							redCards.add("Carta1");
							redCards.add("Carta2");
							redCards.add("Carta3");
							redCards.add("Carta4");
							redCards.add("Carta5");
						}
					}
				}
				
				// ======== Assassino ========
				else if(player1.redClass == "Assassino") {
					String alternateClassResponse = null;
					while (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
						String[] alternateClassOps = {
								"Escolha um",
								"Carlo Aurelius",
								"Yana Bloodspear"
						};
						Thread.sleep(500);
						alternateClassResponse = (String) JOptionPane.showInputDialog(null, player1.Player + ", qual herói você quer ser?", "Red Hero", JOptionPane.QUESTION_MESSAGE, null, alternateClassOps, alternateClassOps[0]);
						if (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
							System.out.println(player1.Player + " não escolheu um herói.");
						} else {
							player1.redHero = alternateClassResponse;
							redCards.add("Carta1");
							redCards.add("Carta2");
							redCards.add("Carta3");
							redCards.add("Carta4");
							redCards.add("Carta5");
						}
					}
				}			
			}
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println(player1.Player + " escolheu " + player1.redClass + " e jogará como " + player1.redHero + ".\n");
			Thread.sleep(500);
			System.out.println("Suas cartas são:");
			System.out.println(redCards + "\n");
			Thread.sleep(800);
			
			// Blue Team Classe e Herói
			
			while (player2.blueClass == null || player2.blueClass == "Escolha um") {
				String[] classes = {
						"Escolha um",
						"Cavaleiro",
						"Arqueiro",
						"Mago",
						"Assassino"
				};
				player2.blueClass = (String) JOptionPane.showInputDialog(null, player2.Player + ", escolha sua classe:", "Blue Class", JOptionPane.QUESTION_MESSAGE, null, classes, classes[0]);
				if(player2.blueClass == null || player2.blueClass == "Escolha um") {
					System.err.println(player2.Player + " não escolheu uma classe");
				}
				
				// ======== Cavaleiro ========
				else if(player2.blueClass == "Cavaleiro") {
					String alternateClassResponse = null;
					while (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
						String[] alternateClassOps = {
							"Escolha um",
							"Rexxar",
							"Alleria Windrunner"
						};
						Thread.sleep(500);
						alternateClassResponse = (String) JOptionPane.showInputDialog(null, player2.Player + ", qual herói você quer ser?", "Blue Hero", JOptionPane.QUESTION_MESSAGE, null, alternateClassOps, alternateClassOps[0]);
						if (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
							System.out.println(player2.Player + " não escolheu um herói.");
						} else {
							player2.blueHero = alternateClassResponse;
							blueCards.add("Carta1");
							blueCards.add("Carta2");
							blueCards.add("Carta3");
							blueCards.add("Carta4");
							blueCards.add("Carta5");
						}
					}
				}
				
				// ======== Arqueiro ========
				else if(player2.blueClass == "Arqueiro") {
					String alternateClassResponse = null;
					while (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
						String[] alternateClassOps = {
							"Escolha um",
							"Delvinar",
							"Bowmistress Li"
						};
						Thread.sleep(500);
						alternateClassResponse = (String) JOptionPane.showInputDialog(null, player2.Player + ", qual herói você quer ser?", "Blue Hero", JOptionPane.QUESTION_MESSAGE, null, alternateClassOps, alternateClassOps[0]);
						if (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
							System.out.println(player2.Player + " não escolheu um herói.");
						} else {
							player2.blueHero = alternateClassResponse;
							blueCards.add("Carta1");
							blueCards.add("Carta2");
							blueCards.add("Carta3");
							blueCards.add("Carta4");
							blueCards.add("Carta5");
						}
					}
				}
				
				
				// ======== Mago ========
				else if(player2.blueClass == "Mago") {
					String alternateClassResponse = null;
					while (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
						String[] alternateClassOps = {
							"Escolha um",
							"Cain Firesong",
							"Grinfel Frostfinger"
						};
						Thread.sleep(500);
						alternateClassResponse = (String) JOptionPane.showInputDialog(null, player2.Player + ", qual herói você quer ser?", "Blue Hero", JOptionPane.QUESTION_MESSAGE, null, alternateClassOps, alternateClassOps[0]);
						if (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
							System.out.println(player2.Player + " não escolheu um herói.");
						} else {
							player2.blueHero = alternateClassResponse;
							blueCards.add("Carta1");
							blueCards.add("Carta2");
							blueCards.add("Carta3");
							blueCards.add("Carta4");
							blueCards.add("Carta5");
						}
					}
				}
				
				// ======== Assassino ========
				else if(player2.blueClass == "Assassino") {
					String alternateClassResponse = null;
					while (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
						String[] alternateClassOps = {
							"Escolha um",
							"Brink Spannercrank",
							"Invar One-Arm"
						};
						Thread.sleep(500);
						alternateClassResponse = (String) JOptionPane.showInputDialog(null, player2.Player + ", qual herói você quer ser?", "Blue Hero", JOptionPane.QUESTION_MESSAGE, null, alternateClassOps, alternateClassOps[0]);
						if (alternateClassResponse == null || alternateClassResponse == "Escolha um") {
							System.out.println(player2.Player + " não escolheu um herói.");
						} else {
							player2.blueHero = alternateClassResponse;
							blueCards.add("Carta1");
							blueCards.add("Carta2");
							blueCards.add("Carta3");
							blueCards.add("Carta4");
							blueCards.add("Carta5");
						}
					}
				}
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=");
				System.out.println(player2.Player + " escolheu " + player2.blueClass + " e jogará como " + player2.blueHero + ".\n");
				Thread.sleep(500);
				System.out.println("Suas cartas são:");
				System.out.println(blueCards + "\n");
				Thread.sleep(800);
			}
			
			System.out.println("Vamos sortear no cara o coroa para quem começa.\n"
					+ "Red Team é coroa e Blue Team é cara.\n");
			System.out.print(". ");
			Thread.sleep(1000);
			System.out.print(". ");
			Thread.sleep(1000);
			System.out.print(". \n");
			Thread.sleep(1000);
			
			int numeroInteiroAleatorio = random.nextInt(2);
			if (numeroInteiroAleatorio == 0){
				System.out.println("\nDeu coroa\n"
						+ "Então o Red Team começa, " + player1.Player + " se prepare.\n\n");
				redTurn = true;
			} else {
				System.out.println("\nDeu cara\n"
						+ "Então o Blue Team começa, " + player2.Player + " se prepare.\n\n");
				blueTurn = true;
			}
			
			while (redLife > 0 && blueLife > 0) {
				// Red Turn
				if (redTurn == true) { // Red Atk
					String choice = JOptionPane.showInputDialog(player1.Player + ", 1 para atacar | 0 para defender: ", "Red Turn");
					int num = Integer.parseInt(choice);
										
						if(num == 1) {
							String CardChoose = null;
							while (CardChoose == null || CardChoose == "Escolha uma") {
								String[] CardOps = {
										"Escolha uma",
										redCards.get(0),
										redCards.get(1),
										redCards.get(2),
										redCards.get(3),
										redCards.get(4)
								};
								Thread.sleep(500);
								CardChoose = (String) JOptionPane.showInputDialog(null, player1.Player + ", com qual carta você quer atacar?", "Red Hero", JOptionPane.QUESTION_MESSAGE, null, CardOps, CardOps[0]);
							}
							System.out.println(player1.Player + " atacou com a " + CardChoose + ".\n");
							if (CardChoose == redCards.get(0)) {
								if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Assassino" && player2.blueClass == "Arqueiro" || player1.redClass == "Arqueiro" && player2.blueClass == "Mago" || player1.redClass == "Cavaleiro" || player2.blueClass == "Assassino") {
									blueLife -= 10 * 1.2;
								} else if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Arqueiro" && player2.blueClass == "Assassino" || player1.redClass == "Mago" && player2.blueClass == "Arqueiro" || player1.redClass == "Assassino" && player2.blueClass == "Cavaleiro") {
									blueLife -= 10 * 0.8;
								} else {
									blueLife -= 10;
								}
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if (CardChoose == redCards.get(1)) {
								if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Assassino" && player2.blueClass == "Arqueiro" || player1.redClass == "Arqueiro" && player2.blueClass == "Mago" || player1.redClass == "Cavaleiro" || player2.blueClass == "Assassino") {
									blueLife -= 10 * 1.2;
								} else if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Arqueiro" && player2.blueClass == "Assassino" || player1.redClass == "Mago" && player2.blueClass == "Arqueiro" || player1.redClass == "Assassino" && player2.blueClass == "Cavaleiro") {
									blueLife -= 10 * 0.8;
								} else {
									blueLife -= 10;
								}
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if (CardChoose == redCards.get(2)) {
								if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Assassino" && player2.blueClass == "Arqueiro" || player1.redClass == "Arqueiro" && player2.blueClass == "Mago" || player1.redClass == "Cavaleiro" || player2.blueClass == "Assassino") {
									blueLife -= 10 * 1.2;
								} else if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Arqueiro" && player2.blueClass == "Assassino" || player1.redClass == "Mago" && player2.blueClass == "Arqueiro" || player1.redClass == "Assassino" && player2.blueClass == "Cavaleiro") {
									blueLife -= 10 * 0.8;
								} else {
									blueLife -= 10;
								}
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if (CardChoose == redCards.get(3)) {
								if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Assassino" && player2.blueClass == "Arqueiro" || player1.redClass == "Arqueiro" && player2.blueClass == "Mago" || player1.redClass == "Cavaleiro" || player2.blueClass == "Assassino") {
									blueLife -= 10 * 1.2;
								} else if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Arqueiro" && player2.blueClass == "Assassino" || player1.redClass == "Mago" && player2.blueClass == "Arqueiro" || player1.redClass == "Assassino" && player2.blueClass == "Cavaleiro") {
									blueLife -= 10 * 0.8;
								} else {
									blueLife -= 10;
								}
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if (CardChoose == redCards.get(4)) {
								if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Assassino" && player2.blueClass == "Arqueiro" || player1.redClass == "Arqueiro" && player2.blueClass == "Mago" || player1.redClass == "Cavaleiro" || player2.blueClass == "Assassino") {
									blueLife -= 10 * 1.2;
								} else if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Arqueiro" && player2.blueClass == "Assassino" || player1.redClass == "Mago" && player2.blueClass == "Arqueiro" || player1.redClass == "Assassino" && player2.blueClass == "Cavaleiro") {
									blueLife -= 10 * 0.8;
								} else {
									blueLife -= 10;
								}
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							}
							blueTurn = true; redTurn = false;
						
						} else if (num == 0) { // Red Def
							String CardChoose = null;
							while (CardChoose == null || CardChoose == "Escolha uma") {
								String[] CardOps = {
										"Escolha uma",
										redCards.get(0),
										redCards.get(1),
										redCards.get(2),
										redCards.get(3),
										redCards.get(4)
								};
								Thread.sleep(500);
								CardChoose = (String) JOptionPane.showInputDialog(null, player1.Player + ", com qual carta você quer defender?", "Red Hero", JOptionPane.QUESTION_MESSAGE, null, CardOps, CardOps[0]);
							}
							System.out.println(player1.Player + " defendeu com a " + CardChoose + ".\n");
							if (CardChoose == redCards.get(0)) {
								if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Assassino" && player2.blueClass == "Arqueiro" || player1.redClass == "Arqueiro" && player2.blueClass == "Mago" || player1.redClass == "Cavaleiro" || player2.blueClass == "Assassino") {
									redLife += 10 * 1.2;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 12 + " pontos de vida, por causa da carta.");
								} else if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Arqueiro" && player2.blueClass == "Assassino" || player1.redClass == "Mago" && player2.blueClass == "Arqueiro" || player1.redClass == "Assassino" && player2.blueClass == "Cavaleiro") {
									redLife += 10 * 0.8;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 8 + " pontos de vida, por causa da carta.");
								} else {
									redLife += 10;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 10 + " pontos de vida, por causa da carta.");
								}
								Thread.sleep(500);
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if(CardChoose == redCards.get(1)) {
								if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Assassino" && player2.blueClass == "Arqueiro" || player1.redClass == "Arqueiro" && player2.blueClass == "Mago" || player1.redClass == "Cavaleiro" || player2.blueClass == "Assassino") {
									redLife += 10 * 1.2;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 12 + " pontos de vida, por causa da carta.");
								} else if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Arqueiro" && player2.blueClass == "Assassino" || player1.redClass == "Mago" && player2.blueClass == "Arqueiro" || player1.redClass == "Assassino" && player2.blueClass == "Cavaleiro") {
									redLife += 10 * 0.8;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 8 + " pontos de vida, por causa da carta.");
								} else {
									redLife += 10;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 10 + " pontos de vida, por causa da carta.");
								}
								Thread.sleep(500);
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if(CardChoose == redCards.get(2)) {
								if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Assassino" && player2.blueClass == "Arqueiro" || player1.redClass == "Arqueiro" && player2.blueClass == "Mago" || player1.redClass == "Cavaleiro" || player2.blueClass == "Assassino") {
									redLife += 10 * 1.2;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 12 + " pontos de vida, por causa da carta.");
								} else if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Arqueiro" && player2.blueClass == "Assassino" || player1.redClass == "Mago" && player2.blueClass == "Arqueiro" || player1.redClass == "Assassino" && player2.blueClass == "Cavaleiro") {
									redLife += 10 * 0.8;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 8 + " pontos de vida, por causa da carta.");
								} else {
									redLife += 10;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 10 + " pontos de vida, por causa da carta.");
								}
								Thread.sleep(500);
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if(CardChoose == redCards.get(3)) {
								if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Assassino" && player2.blueClass == "Arqueiro" || player1.redClass == "Arqueiro" && player2.blueClass == "Mago" || player1.redClass == "Cavaleiro" || player2.blueClass == "Assassino") {
									redLife += 10 * 1.2;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 12 + " pontos de vida, por causa da carta.");
								} else if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Arqueiro" && player2.blueClass == "Assassino" || player1.redClass == "Mago" && player2.blueClass == "Arqueiro" || player1.redClass == "Assassino" && player2.blueClass == "Cavaleiro") {
									redLife += 10 * 0.8;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 8 + " pontos de vida, por causa da carta.");
								} else {
									redLife += 10;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 10 + " pontos de vida, por causa da carta.");
								}
								Thread.sleep(500);
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if(CardChoose == redCards.get(4)) {
								if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Assassino" && player2.blueClass == "Arqueiro" || player1.redClass == "Arqueiro" && player2.blueClass == "Mago" || player1.redClass == "Cavaleiro" || player2.blueClass == "Assassino") {
									redLife += 10 * 1.2;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 12 + " pontos de vida, por causa da carta.");
								} else if(player1.redClass == "Cavaleiro" && player2.blueClass == "Mago" || player1.redClass == "Arqueiro" && player2.blueClass == "Assassino" || player1.redClass == "Mago" && player2.blueClass == "Arqueiro" || player1.redClass == "Assassino" && player2.blueClass == "Cavaleiro") {
									redLife += 10 * 0.8;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 8 + " pontos de vida, por causa da carta.");
								} else {
									redLife += 10;
									JOptionPane.showMessageDialog(null, "Red Team ganhou " + 10 + " pontos de vida, por causa da carta.");
								}
								Thread.sleep(500);
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							}
							blueTurn = true; redTurn = false;
						}
				
						
				// Blue turn
				} else if (blueTurn == true) { // Blue Atk
					String choice = JOptionPane.showInputDialog(player2.Player + ", 1 para atacar | 0 para defender: ", "Blue Turn");
					int num = Integer.parseInt(choice);
						if(num == 1) {
							String CardChoose = null;
							while (CardChoose == null || CardChoose == "Escolha uma") {
								String[] CardOps = {
										"Escolha uma",
										blueCards.get(0),
										blueCards.get(1),
										blueCards.get(2),
										blueCards.get(3),
										blueCards.get(4)
								};
								Thread.sleep(500);
								CardChoose = (String) JOptionPane.showInputDialog(null, player2.Player + ", com qual carta você quer atacar?", "Blue Hero", JOptionPane.QUESTION_MESSAGE, null, CardOps, CardOps[0]);
								
							}
							System.out.println(player2.Player + " atacou com a " + CardChoose + ".\n");
							if (CardChoose == blueCards.get(0)) {
								if(player2.blueClass == "Cavaleiro" && player1.redClass == "Mago" || player2.blueClass == "Assassino" && player1.redClass == "Arqueiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Mago" || player2.blueClass == "Cavaleiro" || player1.redClass == "Assassino") {
									redLife -= 10 * 1.2;
								} else if(player2.blueClass == "Mago" && player1.redClass == "Cavaleiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Assassino" || player2.blueClass == "Mago" && player1.redClass == "Arqueiro" || player2.blueClass == "Assassino" && player1.redClass == "Cavaleiro") {
									redLife -= 10 * 0.8;
								} else {
									redLife -= 10;
								}
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if (CardChoose == blueCards.get(1)) {
								if(player2.blueClass == "Cavaleiro" && player1.redClass == "Mago" || player2.blueClass == "Assassino" && player1.redClass == "Arqueiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Mago" || player2.blueClass == "Cavaleiro" || player1.redClass == "Assassino") {
									redLife -= 10 * 1.2;
								} else if(player2.blueClass == "Mago" && player1.redClass == "Cavaleiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Assassino" || player2.blueClass == "Mago" && player1.redClass == "Arqueiro" || player2.blueClass == "Assassino" && player1.redClass == "Cavaleiro") {
									redLife -= 10 * 0.8;
								} else {
									redLife -= 10;
								}
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if (CardChoose == blueCards.get(2)) {
								if(player2.blueClass == "Cavaleiro" && player1.redClass == "Mago" || player2.blueClass == "Assassino" && player1.redClass == "Arqueiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Mago" || player2.blueClass == "Cavaleiro" || player1.redClass == "Assassino") {
									redLife -= 10 * 1.2;
								} else if(player2.blueClass == "Mago" && player1.redClass == "Cavaleiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Assassino" || player2.blueClass == "Mago" && player1.redClass == "Arqueiro" || player2.blueClass == "Assassino" && player1.redClass == "Cavaleiro") {
									redLife -= 10 * 0.8;
								} else {
									redLife -= 10;
								}
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if (CardChoose == blueCards.get(3)) {
								if(player2.blueClass == "Cavaleiro" && player1.redClass == "Mago" || player2.blueClass == "Assassino" && player1.redClass == "Arqueiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Mago" || player2.blueClass == "Cavaleiro" || player1.redClass == "Assassino") {
									redLife -= 10 * 1.2;
								} else if(player2.blueClass == "Mago" && player1.redClass == "Cavaleiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Assassino" || player2.blueClass == "Mago" && player1.redClass == "Arqueiro" || player2.blueClass == "Assassino" && player1.redClass == "Cavaleiro") {
									redLife -= 10 * 0.8;
								} else {
									redLife -= 10;
								}
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if (CardChoose == blueCards.get(4)) {
								if(player2.blueClass == "Cavaleiro" && player1.redClass == "Mago" || player2.blueClass == "Assassino" && player1.redClass == "Arqueiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Mago" || player2.blueClass == "Cavaleiro" || player1.redClass == "Assassino") {
									redLife -= 10 * 1.2;
								} else if(player2.blueClass == "Mago" && player1.redClass == "Cavaleiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Assassino" || player2.blueClass == "Mago" && player1.redClass == "Arqueiro" || player2.blueClass == "Assassino" && player1.redClass == "Cavaleiro") {
									redLife -= 10 * 0.8;
								} else {
									redLife -= 10;
								}
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							}
							blueTurn = false; redTurn = true;
						
						} else if (num == 0) { // Blue Def
							String CardChoose = null;
							while (CardChoose == null || CardChoose == "Escolha uma") {
								String[] CardOps = {
										"Escolha uma",
										blueCards.get(0),
										blueCards.get(1),
										blueCards.get(2),
										blueCards.get(3),
										blueCards.get(4)
								};
								Thread.sleep(500);
								CardChoose = (String) JOptionPane.showInputDialog(null, player2.Player + ", com qual carta você quer defender?", "Blue Hero", JOptionPane.QUESTION_MESSAGE, null, CardOps, CardOps[0]);
								
							}
							System.out.println(player2.Player + " defendeu com a " + CardChoose + ".\n");
							if (CardChoose == blueCards.get(0)) {
								if(player2.blueClass == "Cavaleiro" && player1.redClass == "Mago" || player2.blueClass == "Assassino" && player1.redClass == "Arqueiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Mago" || player2.blueClass == "Cavaleiro" || player1.redClass == "Assassino") {
									blueLife += 10 * 1.2;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou" + 12 + " pontos de vida, por causa da carta.");
								} else if(player2.blueClass == "Mago" && player1.redClass == "Cavaleiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Assassino" || player2.blueClass == "Mago" && player1.redClass == "Arqueiro" || player2.blueClass == "Assassino" && player1.redClass == "Cavaleiro") {
									blueLife += 10 * 0.8;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou " + 8 + " pontos de vida, por causa da carta.");
								} else {
									blueLife += 10;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou " + 10 + " pontos de vida, por causa da carta.");
								}
								Thread.sleep(500);
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if(CardChoose == blueCards.get(1)) {
								if(player2.blueClass == "Cavaleiro" && player1.redClass == "Mago" || player2.blueClass == "Assassino" && player1.redClass == "Arqueiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Mago" || player2.blueClass == "Cavaleiro" || player1.redClass == "Assassino") {
									blueLife += 10 * 1.2;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou" + 12 + " pontos de vida, por causa da carta.");
								} else if(player2.blueClass == "Mago" && player1.redClass == "Cavaleiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Assassino" || player2.blueClass == "Mago" && player1.redClass == "Arqueiro" || player2.blueClass == "Assassino" && player1.redClass == "Cavaleiro") {
									blueLife += 10 * 0.8;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou " + 8 + " pontos de vida, por causa da carta.");
								} else {
									blueLife += 10;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou " + 10 + " pontos de vida, por causa da carta.");
								}
								Thread.sleep(500);
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if(CardChoose == blueCards.get(2)) {
								if(player2.blueClass == "Cavaleiro" && player1.redClass == "Mago" || player2.blueClass == "Assassino" && player1.redClass == "Arqueiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Mago" || player2.blueClass == "Cavaleiro" || player1.redClass == "Assassino") {
									blueLife += 10 * 1.2;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou" + 12 + " pontos de vida, por causa da carta.");
								} else if(player2.blueClass == "Mago" && player1.redClass == "Cavaleiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Assassino" || player2.blueClass == "Mago" && player1.redClass == "Arqueiro" || player2.blueClass == "Assassino" && player1.redClass == "Cavaleiro") {
									blueLife += 10 * 0.8;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou " + 8 + " pontos de vida, por causa da carta.");
								} else {
									blueLife += 10;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou " + 10 + " pontos de vida, por causa da carta.");
								}
								Thread.sleep(500);
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if(CardChoose == blueCards.get(3)) {
								if(player2.blueClass == "Cavaleiro" && player1.redClass == "Mago" || player2.blueClass == "Assassino" && player1.redClass == "Arqueiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Mago" || player2.blueClass == "Cavaleiro" || player1.redClass == "Assassino") {
									blueLife += 10 * 1.2;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou" + 12 + " pontos de vida, por causa da carta.");
								} else if(player2.blueClass == "Mago" && player1.redClass == "Cavaleiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Assassino" || player2.blueClass == "Mago" && player1.redClass == "Arqueiro" || player2.blueClass == "Assassino" && player1.redClass == "Cavaleiro") {
									blueLife += 10 * 0.8;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou " + 8 + " pontos de vida, por causa da carta.");
								} else {
									blueLife += 10;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou " + 10 + " pontos de vida, por causa da carta.");
								}
								Thread.sleep(500);
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							} else if(CardChoose == blueCards.get(4)) {
								if(player2.blueClass == "Cavaleiro" && player1.redClass == "Mago" || player2.blueClass == "Assassino" && player1.redClass == "Arqueiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Mago" || player2.blueClass == "Cavaleiro" || player1.redClass == "Assassino") {
									blueLife += 10 * 1.2;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou" + 12 + " pontos de vida, por causa da carta.");
								} else if(player2.blueClass == "Mago" && player1.redClass == "Cavaleiro" || player2.blueClass == "Arqueiro" && player1.redClass == "Assassino" || player2.blueClass == "Mago" && player1.redClass == "Arqueiro" || player2.blueClass == "Assassino" && player1.redClass == "Cavaleiro") {
									blueLife += 10 * 0.8;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou " + 8 + " pontos de vida, por causa da carta.");
								} else {
									blueLife += 10;
									JOptionPane.showMessageDialog(null, "Blue Team ganhou " + 10 + " pontos de vida, por causa da carta.");
								}
								Thread.sleep(500);
								JOptionPane.showMessageDialog(null, "Red Team está com " + redLife + " pontos de vida.\nBlue Team está com " + blueLife + " pontos de vida.");
								Thread.sleep(500);
							}
							blueTurn = false; redTurn = true;
						}
				}
			
			}// End while redlife e bluelife
			
			if (redLife > blueLife) {
				JOptionPane.showMessageDialog(null, "Parabéns " + player1.Player + ".\nO Time Vermelho ganhou a disputa!\n");
			} else {
				JOptionPane.showMessageDialog(null, "Parabéns " + player2.Player + ".\nO Time Azul ganhou a disputa!\n");
			}
			
			agradecimento();
			
		} // End Class TesteGame
	}
}
