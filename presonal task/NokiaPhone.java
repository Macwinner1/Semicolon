
import java.util.Scanner; 
 
public class NokiaPhone{ 
    public static void main(String[] args) { 
	int pressClock = 0;
        String menu = """ 

		Welcome to the menu list 
		Press: 
 
		1 -> Phone book 
		2 -> Messages 
		3 -> Chat 
		4 -> Call register 
		5 -> Tones 
		6 -> Settings 
		7 -> Call divert 
		8 -> Games 
		9 -> Calculator 
		10 -> Reminders 
		11 -> Clock 
		12 -> Profiles 
		13 -> SIM services
		14 -> Exit

 
                """; 
 
        System.out.print(menu); 
        Scanner menuInput = new Scanner(System.in); 
            int pressMenu = menuInput.nextInt(); 
 
            switch (pressMenu) { 
                case 1: { 
                    String phonebook = """ 

			1. Phonebook 
 
			1 -> Search 
			2 -> Service Nos. 
			3 -> Add name 
			4 -> Erase 
			5 -> Edit 
			6 -> Assign tone 
			7 -> Send b'card 
			8 -> Options 
			9 -> Speed dials 
			10 -> Voice tags
			11 <- Back
 
                            """; 
                    System.out.print(phonebook); 
                    int pressPhoneBook = menuInput.nextInt(); 
 
                    switch (pressPhoneBook) { 
                        case 1: {String search = """
			
				1. Search

                            """; System.out.print(search);} 
                            break; 
                        case 2: {String serviceNos = """

				2. Service Nos

			    """;   System.out.print(serviceNos);} 
                            break; 
                        case 3: {String addName = """

				3. Add name

			    """;   System.out.print(addName);} 
                            break; 
                        case 4:{String erase = """

				4. Erase

			    """;   System.out.print(erase);} 
                            break; 
                        case 5: {String edit = """

				5. Edit

			    """;   System.out.print(edit);} 
                            break; 
                        case 6: {String assignTone = """

				6. Assign tone

			    """;   System.out.print(assignTone);} 
                            break; 
                        case 7: {String sendBcard = """

				7. Send b'card

		 	    """;   System.out.print(sendBcard);} 
                            break; 
                        case 8: { 
                            String options = """ 

				8. Options 

				1. Type of view 
				2. Memory status 
				3.<- Back


                                    """; 
                            System.out.print(options); 
                            int pressOptions = menuInput.nextInt(); 
                            switch (pressOptions) { 
                                case 1: {String typeView = """

					1. Type of view

				    """; System.out.print(typeView);} 
                                    break; 
                                case 2:{String memoryStatus = """

					2. Memory status

				    """; System.out.print(memoryStatus);} 
                                    break; 
                            } 
                            break; 
                        } 
                        case 9:{String speedDials = """

				9. Speed dials

			    """;   System.out.print(speedDials);} 
                            break; 
                        case 10:{String voiceTags = """

				10. Voice tags

			    """;   System.out.print(voiceTags);}
                            break; 
                    } 
                    break; 
                } 
                case 2: { 
                    String messages = """ 


			2. Messages 
 
			1 -> Write messages 
			2 -> Inbox 
			3 -> Outbox 
			4 -> Picture messages 
			5 -> Templates 
			6 -> Smileys 
			7 -> Message settings 
			8 -> Info service 
			9 -> Voice mailbox number 
			10 -> Service command editor 
			11 <- Back

                            """; 
                    System.out.print(messages); 
                    int pressMessages = menuInput.nextInt(); 
 
                    switch (pressMessages) { 
                        case 1: {String writeMessages = """

				1. Write Messages

			    """;   System.out.print(writeMessages);} 
                            break; 
                        case 2: {String inbox = """

				2. Inbox

			    """;   System.out.print(inbox);} 
                            break; 
                        case 3:{String outbox = """

				3. Outbox
	
			    """;   System.out.print(outbox);} 
                            break; 
                        case 4:{String pictureMessages = """

				4. Picture Messages

			    """;   System.out.print(pictureMessages);}
                            break; 
                        case 5: {String templates = """

				5. Templates

			    """;   System.out.print(templates);} 
                            break; 
                        case 6: {String smileys = """

				6. Smileys

			    """;   System.out.print(smileys);} 
                            break; 
                        case 7: { 
                            String messageSettings = """ 

				7. Message Settings 
 
				1. Set 1 
				2. Common 
				3.<- Back

                                    """; 
                            System.out.print(messageSettings); 
                            int pressMessageSettings = menuInput.nextInt(); 
                            switch (pressMessageSettings) { 
                                case 1: { 
                                    String set1 = """ 

					1. Set 1 
 
					1. Message center number 
					2. Messages sent as 
					3. Message validity
					4.<- back
 
                                            """; 
                                    System.out.print(set1); 
                                    int pressSet1 = menuInput.nextInt(); 
                                    switch (pressSet1) { 
                                        case 1: {String messageCenter = """
   
						1. Message center number

					    """; System.out.print(messageCenter);} 
                                            break; 
                                        case 2: {String messagesSent = """

						2. Message sent as

					    """; System.out.print(messagesSent);} 
                                            break; 
                                        case 3:{String messagesValidity = """

						3. Message validity

					    """; System.out.print(messagesValidity);} 
                                            break; 
                                    } 
                                    break; 
                                } 
                                case 2: { 
                                    String common = """ 

					2. Common 
 
					1. Delivery reports 
					2. Reply via same centre 
					3. Character support 
					4.<- Back


                                            """; 
                                    System.out.print(common); 
                                    int pressCommon = menuInput.nextInt(); 
                                    switch (pressCommon) { 
                                        case 1:{String deliveryReports = """
   
						1. Delivery reports

					    """; System.out.print(deliveryReports);}
                                            break; 
                                        case 2: {String replyVia = """

						2. Reply Via same centre

					    """; System.out.print(replyVia);}
                                            break; 
                                        case 3:{String characterSupport = """

						3. Character support

					    """; System.out.print(characterSupport);}
                                            break; 
                                    } 
                                    break; 
                                } 
                            } 
                            break; 
                        } 
                        case 8: {String infoService = """

				8. Info Service

			    """;   System.out.print(infoService);} 
                            break; 
                        case 9: {String voiceMailboxNumber = """

				9. Voice mailbox number 
	
			    """;   System.out.print(voiceMailboxNumber);}
                            break; 
                        case 10: {String serviceCommand = """

				 10. Service command editor 

			    """;   System.out.print(serviceCommand);} 
                            break; 
                    } 
                    break; 
                } 
                case 3: { String chat = """

			3. Chat

		    """;   System.out.print(chat);}
                    break; 
                case 4: { 
                    String callRegister = """ 


			4. Call register 
 
			1 -> Missed calls 
			2 -> Received calls 
			3 -> Dialled numbers 
			4 -> Erase recent call lists 
			5 -> Show call duration 
			6 -> Show call costs 
			7 -> Call cost settings 
			8 -> Prepaid credit 
			9 <- Back

                            """; 
                    System.out.print(callRegister); 
                    int pressCallRegister = menuInput.nextInt(); 
 
                    switch (pressCallRegister) { 
                        case 1: {String missedCalls = """

				1. Missed calls

			    """;   System.out.print(missedCalls);} 
                            break; 
                        case 2: {String receivedCalls = """

				2. Received calls

			    """;   System.out.print(receivedCalls);} 
                            break; 
                        case 3: {String dialledNumbers = """

				3. Dialled numbers

			    """;   System.out.print(dialledNumbers);} 
                            break; 
                        case 4: {String eraseRecentCall = """

				4. Erase recent call lists

			    """;   System.out.print(eraseRecentCall);} 
                            break; 
                        case 5: {  
				String showCallDuration = """ 

					5. Show call duration 
 
					1. Last call duration 
					2. All calls' duration 
					3. Received calls' duration
					4. Dialled calls' duration
					5. Clear timers
					6.<- Back

                                            """; 
                                    System.out.print(showCallDuration); 
                                    int pressShowCallDuration = menuInput.nextInt(); 
                                    switch (pressShowCallDuration) { 
                                        case 1: {String lastCallDuration = """
   
						1. Last call duration

					    """; System.out.print(lastCallDuration);} 
                                            break; 
                                        case 2: {String allCallsDuration = """

						2. All calls' duration 

					    """; System.out.print(allCallsDuration);} 
                                            break; 
                                        case 3:{String receivedCallsDuration = """

						3. Received calls' duration

					    """; System.out.print(receivedCallsDuration);}
					    break;
                                        case 4: {String dialledCallsDuration = """
   
						4. Dialled calls' duration

					    """; System.out.print(dialledCallsDuration);} 
                                            break; 
                                        case 5: {String clearTimers = """

						5. Clear timers

					    """; System.out.print(clearTimers);} 
                                            break;
                                    } 
                                    break; 
                                } 

                        case 6: { 
				String showCallCosts = """ 


					6. Show call costs 
 
					1. Last call cost 
					2. All calls' cost
					3. Clear counters
					4.<- Back

                                            """; 
                                    System.out.print(showCallCosts); 
                                    int pressShowCallCost = menuInput.nextInt(); 
                                    switch (pressShowCallCost) { 
                                        case 1: {String lastCallCost = """
   
						1. Last call cost

					    """; System.out.print(lastCallCost);} 
                                            break; 
                                        case 2: {String allCallsCost = """

						2. All calls' cost 

					    """; System.out.print(allCallsCost);} 
                                            break; 
                                        case 3: {String clearCounters = """

						3. Clear counters

					    """; System.out.print(clearCounters);} 
                                            break;
                                    } 
                                    break; 
                                } 

                        case 7: {
				String callCostSettings = """ 


					7. Call cost settings 
 
					1. Call cost limit 
					2. Show costs in
					3.<- Back

                                            """; 
                                    System.out.print(callCostSettings); 
                                    int pressCallCostSettings = menuInput.nextInt(); 
                                    switch (pressCallCostSettings) { 
                                        case 1: {String callCostLimit = """
   
						1. Call cost limit

					    """; System.out.print(callCostLimit);} 
                                            break; 
                                        case 2: {String showCostsIn = """

						2. Show costs in

					    """; System.out.print(showCostsIn);} 
                                            break;
                                    } 
                                    break; 
                                } 
                        case 8: {String prepaidCredit = """

				8. Prepaid credit

			    """;   System.out.print(prepaidCredit);}
                            break; 
                    } 
                    break; 
                } 
                case 5: { 
                    String tones = """ 

                            5. Tones 
 
                            1 -> Ringing tone 
                            2 -> Ringing volume 
                            3 -> Incoming call alert 
                            4 -> Composer 
                            5 -> Message alert tone 
                            6 -> Keypad tones 
                            7 -> Warning and game tones 
                            8 -> Vibrating alert 
                            9 -> Screen saver 
			    10 <-Back

                            """; 
                    System.out.print(tones); 
                    int pressTones = menuInput.nextInt(); 
 
                    switch (pressTones) { 
                        case 1: {String ringingTone = """

				1. Ringing Tone

			    """;   System.out.print(ringingTone);}
                            break; 
                        case 2: {String ringingVolume = """

				2. Ringing volume

			    """;   System.out.print(ringingVolume);} 
                            break; 
                        case 3:{String incomingCall = """

				3. Incoming call alert

			    """;   System.out.print(incomingCall);}
                            break; 
                        case 4:{String composer = """

				4. Composers

				""";   System.out.print(composer);} 
                            break; 
                        case 5: {String messageAlert = """

				5. Message alert tone

			    """;   System.out.print(messageAlert);} 
                            break; 
                        case 6:{String keypadTones = """

				6. Keypad tones

			    """;   System.out.print(keypadTones);} 
                            break; 
                        case 7:{String warningAndGame = """

				7. Warning and game tones

			    """;   System.out.print(warningAndGame);} 
                            break; 
                        case 8: {String vibratingAlert = """

				8. Vibrating alert

			    """;   System.out.print(vibratingAlert);} 
                            break; 
                        case 9: {String screenSaver = """

				9. Screen saver

			    """;   System.out.print(screenSaver);} 
                            break; 
                    } 
                    break; 
                } 
                case 6: {                           
                      String settings = """ 

    				6. Settings 
 
                                1 -> Call settings 
            			2 -> Phone settings 
                           	3 -> Security settings 
                            	4 -> Restore factory settings
				5 <- Back 
 
                                    """; 
                            System.out.print(settings); 
                            int pressSetting = menuInput.nextInt(); 
                            switch (pressSetting) { 
                                case 1: { 
                                    String callSettings = """ 

					1. Call settings 
 
					1. Automatic redial 
					2. Speed dialling 
					3. Call waiting options
					4. Own number sending
					5. Phone line in use
					6. Automatic answer
					7.<- Back


                                            """; 
                                    System.out.print(callSettings); 
                                    int pressCallSettings = menuInput.nextInt(); 
                                    switch (pressCallSettings) { 
                                        case 1: {String automaticRedial = """
   
						1. Automatic redial

					    """; System.out.print(automaticRedial);} 
                                            break; 
                                        case 2: {String speedDialling = """

						2. Speed dialling

					    """; System.out.print(speedDialling);} 
                                            break; 
                                        case 3:{String callWaiting = """

						3. Call waiting options

					    """; System.out.print(callWaiting);}
					    break;
                                        case 4: {String ownNumber = """
   
						4. Own number sending

					    """; System.out.print(ownNumber);} 
                                            break; 
                                        case 5: {String phoneLineIn = """

						5. Phone line in use

					    """; System.out.print(phoneLineIn);} 
                                            break; 
                                        case 6:{String automaticAnswer = """

						6. Automatic answer

					    """; System.out.print(automaticAnswer);} 
                                            break; 
                                    } 
                                    break; 
                                } 
				case 2: { 
                                    String phoneSetting = """ 

					2. Phone setting 

					1. Language 
					2. Cell info display
					3. Welcome note
					4. Network selection
					5. Lights
					6. Confirm SIM service actions
					7.<- Back


                                            """; 
                                    System.out.print(phoneSetting); 
                                    int pressPhoneSettings = menuInput.nextInt(); 
                                    switch (pressPhoneSettings) { 
                                        case 1: {String language = """
   
						1. Language

					    """; System.out.print(language);} 
                                            break; 
                                        case 2: {String cellInfoDisplay = """

						2. Cell info display

					    """; System.out.print(cellInfoDisplay);} 
                                            break; 
                                        case 3:{String welcomeNote = """

						3. Welcome note

					    """; System.out.print(welcomeNote);}
					    break;
                                        case 4: {String networkSelection = """
   
						4. Network selection

					    """; System.out.print(networkSelection);} 
                                            break; 
                                        case 5: {String lights = """

						5. Lights

					    """; System.out.print(lights);} 
                                            break; 
                                        case 6:{String confirmSIM = """

						6. Confirm SIM service actions

					    """; System.out.print(confirmSIM);} 
                                            break; 
                                    } 
                                    break; 
                                } 
				case 3: { 
                                    String securitySetting = """ 


					3. Security settings
 
					1. PIN code request 
					2. Call barring service 
					3. Fixed dialling
					4. Closed user group
					5. Phone security
					6. Change access codes
					7.<- Back


                                            """; 
                                    System.out.print(securitySetting); 
                                    int pressSecuritySetting = menuInput.nextInt(); 
                                    switch (pressSecuritySetting) { 
                                        case 1: {String codeRequest = """
   
						1. PIN code request

					    """; System.out.print(codeRequest);} 
                                            break; 
                                        case 2: {String callBarringService = """

						2. Call barring service

					    """; System.out.print(callBarringService);} 
                                            break; 
                                        case 3:{String fixedDialling = """

						3. Fixed dialling

					    """; System.out.print(fixedDialling);}
					    break;
                                        case 4: {String closedUserGroup = """
   
						4. Closed user group

					    """; System.out.print(closedUserGroup);} 
                                            break; 
                                        case 5: {String phoneSecurity = """

						5. Phone security

					    """; System.out.print(phoneSecurity);} 
                                            break; 
                                        case 6:{String changeAccessCodes = """

						6. Change access codes

					    """; System.out.print(changeAccessCodes);} 
                                            break; 
                                    } 
                                    break; 
                                } 

                                case 4: {String restoreFactory = """

					4. Restore factory setting

			    	     """;   System.out.print(restoreFactory);} 
                            	     break;
                                     
                                } break;
                            }
                case 7:{ String callDivert = """

			7. Call divert

		    """;   System.out.print(callDivert); 
                    int pressCallDivert = menuInput.nextInt();
			switch (pressCallDivert) {
				case 0:{System.out.print("0 back");}
				default: {System.out.print("Invaild Input");}  
				} break;
                             } 

			 
                case 8:{ String games = """

			Games
			0. Back

		    """;   System.out.print(games); 
                     int pressGames = menuInput.nextInt();
			switch (pressGames) {
				case 0:{System.out.print("0 back");} 
				} break;
                             } 

                case 9:{ String calculator = """

			Calculator
			0. Back

		    """;   System.out.print(calculator); 
                     int pressCalculator = menuInput.nextInt();
			switch (pressCalculator) {
				case 0:{System.out.print("0 back");} 
				} break;
                             } 
 

                case 10:{ String reminders = """

			Reminders
			0. Back

		    """;   System.out.print(reminders); 
                    int pressReminders = menuInput.nextInt();
			switch (pressReminders) {
				case 0:{System.out.print("0 back");} 
				} break;
                             } 

                case 11: {  
		
                    String clock = """ 
			
			11. Clock 
 
			1 -> Alarm clock 
			2 -> Clock settings 
			3 -> Date setting 
			4 -> Stopwatch 
			5 -> Countdown timer 
			6 -> Auto update of date and time 
			0 <- Back


                            """; 
                    System.out.print(clock); 
                     pressClock = menuInput.nextInt(); 
                    switch (pressClock) { 
                        case 1:{String alarmClock = """

				Alarm Clock
				0. Back

			    """;   System.out.print(alarmClock);
				int pressAlarmClock = menuInput.nextInt();
			switch (pressAlarmClock) {
				case 0:{System.out.print("0 back");} 
				} break;
                             }
                        case 2:{String clockSettings = """

				Clock settings
				0. Back

			    """;   System.out.print(clockSettings); 
                            int pressClockSettings = menuInput.nextInt();
			switch (pressClockSettings) {
				case 0:{System.out.print("0 back");} 
				} break;
                             } 

                        case 3:{String dateSetting = """

				Date setting
				0. Back

			    """;   System.out.print(dateSetting); 
                            int pressDateSetting = menuInput.nextInt();
			switch (pressDateSetting) {
				case 0:{System.out.print("0 back");} 
				} break;
                             }  

                        case 4: {String stopwatch = """

				Stopwatch
				0. Back

			    """;   System.out.print(stopwatch); 
                             int pressStopwatch = menuInput.nextInt();
			switch (pressStopwatch) {
				case 0:{System.out.print("0 back");} 
				} break;
                             }
 
                        case 5:{String countdownTimer = """

				Countdown timer
				0. Back

			    """;   System.out.print(countdownTimer);
                            int pressCountdownTimer = menuInput.nextInt();
			switch (pressCountdownTimer) {
				case 0:{System.out.print("0 back");} 
				} break;
                             } 

                        case 6:{String AutoUpdate = """

				Auto update of date and time
				0. Back

			    """;   System.out.print(AutoUpdate); 
                            int pressAutoUpdate = menuInput.nextInt();
			switch (pressAutoUpdate) {
				case 0:{System.out.print("0 back");} 
				} break;
                             } 
                    }
                    break; 		
                } 
                case 12:{ String profiles = """

			Profiles
			0. Back

		    """;   System.out.print(profiles);
                    int pressProfiles = menuInput.nextInt();
			switch (pressProfiles) {
				case 0:{System.out.print("0 back");} 
				} break;
                             } 
                case 13: { String simServices = """

			SIM services
			0. Back

		    """;   System.out.print(simServices); 
                    int pressSimServices = menuInput.nextInt();
			switch (pressSimServices) {
				case 0:{System.out.print("0 back");} 
				} break;
                             } 
                default: 
                    System.out.print("Invalid option"); 
                    break; 
            } 
       { 
            menuInput.close(); 
        } 
    } 
} 