/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * ECS414U - Object Oriented Programming
 * Queen Mary University of London, 2021/22.
 * <p>
 * Week 5 lab session.
 */

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BankingApp extends Frame{

	/*
	 * We will use this to print messages to the user.
	 */
	private static TextArea infoArea = new TextArea("BankingApp 0.5");

	public static void print(String text){
		infoArea.setText(text);
	}
	//---


	private Agent agent;
	private Panel clientButtonsPanel;


	/**
	 * This method prints the names of all clients.
	 */
	public void printClients(){
		String text = agent.getListOfClientNames();
		print(text);
	}

	/**
	 * This method prints the information of the client with the given index.
	 */
	public void printClientInfo(int index){
		String text = agent.getClientInfo(index);
		print(text);
	}

	/**
	 * This method takes all the necessary steps when a client is added.
	 */
	public void addClient(String name){
		agent.addClient(new Client(name));
		System.out.println(name);

		int numClients = agent.getNumberOfClients();
		Button btn = new Button("Client " + numClients);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				printClientInfo(numClients -1);
			}
		});
		clientButtonsPanel.add(btn);
		this.setVisible(true); // Just to refresh the frame, so that the button shows up
	}

	public BankingApp(){

		this.agent = new Agent();
		this.setLayout(new FlowLayout());

		// Make this button work
		Button reportButton=new Button("Print client list");
		reportButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				printClients();
			}
		});
		this.add(reportButton);

		// Make this button work
		Button addClientButton=new Button("Add client");
		addClientButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				Prompt acp = new Prompt();
				TextField tfName = new TextField("", 25);
				acp.add(tfName);
				acp.activate();
				acp.addSubmitListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						addClient(tfName.getText());
						acp.dispose();
					}
				});

			}
		});

		this.add(addClientButton);

		// Make this button work
		Button depositButton = new Button("Deposit");
		depositButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Prompt acp = new Prompt();
				TextField cName = new TextField("", 25);
				acp.add(cName);
				TextField cAmount = new TextField("", 25);
				acp.add(cAmount);
				acp.activate();
				acp.submit.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						String clName = cName.getText();
						int clAmount = Integer.parseInt(cAmount.getText());
						boolean flag = agent.deposit(clName, clAmount);
						if (flag){
							System.out.println(clAmount + "$ has been deposited in "+ clName +" account.");
						}
						else{
							System.out.println("Client doesn't exist!!!");
						}
						acp.dispose();
					}
				});
			}
		});
		this.add(depositButton);


		// Output console
		infoArea.setEditable(false);
		this.add(infoArea);

		// Client button panel
		// Uncomment for R3
		clientButtonsPanel = new Panel();
		clientButtonsPanel.setLayout(new GridLayout(0,1));
		clientButtonsPanel.setVisible(true);
		this.add(clientButtonsPanel);


		// We add a couple of clients of testing purposes
		this.addClient("Alice Alison");
		this.addClient("Bob Robertson");

		// This is just so the X button closes our app
		WindowCloser wc = new WindowCloser();
		this.addWindowListener(wc);

		this.setSize(500,500);// Self explanatory
		this.setLocationRelativeTo(null); // Centers the window on the screen
		this.setVisible(true);// Self explanatory

	}

	public static void main(String[] args){
		new BankingApp();
	}
}

