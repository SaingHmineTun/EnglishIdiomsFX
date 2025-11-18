package com.itsaimao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Data {
    private static final Set<Idiom> IDIOM_LIST = new HashSet<>();

    static {
        IDIOM_LIST.add(new Idiom(1, 'c', "Crocodile Tears", "\"Shedding tears of crocodile\" - to pretend to be sad or sorry when you are not really sad or sorry at all",
                List.of("The politician's tears were clearly crocodile tears - he was only pretending to be sorry for his mistakes.",
                        "Don't be fooled by her crocodile tears; she's not really sad about breaking your favorite vase.")));

        IDIOM_LIST.add(new Idiom(2, 'b', "Break The Ice", "To initiate a conversation in a social setting",
                List.of("He told a joke to break the ice at the beginning of the meeting.",
                        "It's always hard to break the ice at formal events.")));

        IDIOM_LIST.add(new Idiom(3, 'h', "Hit The Hay", "To go to bed, to go to sleep",
                List.of("I'm exhausted, I'm going to hit the hay early tonight.",
                        "It's late, let's hit the hay.")));

        IDIOM_LIST.add(new Idiom(4, 'b', "Bite The Bullet", "To endure a painful or unpleasant situation that is unavoidable",
                List.of("I don't want to have this difficult conversation, but I'll just have to bite the bullet.",
                        "After the surgery, he had to bite the bullet and deal with the painful recovery process.")));

        IDIOM_LIST.add(new Idiom(5, 's', "Spill The Beans", "To reveal secret or confidential information",
                List.of("She spilled the beans about the surprise party, ruining the whole thing.",
                        "The journalist threatened to spill the beans if the source didn't come forward.")));

        IDIOM_LIST.add(new Idiom(6, 'k', "Kill Two Birds With One Stone", "To accomplish two different things with a single action",
                List.of("By taking the online course, she killed two birds with one stone: learning a new skill and networking.",
                        "We can kill two birds with one stone by combining our marketing efforts with customer service.")));

        IDIOM_LIST.add(new Idiom(7, 'l', "Let The Cat Out Of The Bag", "To accidentally reveal a secret",
                List.of("He let the cat out of the bag about their engagement before she could tell her family.",
                        "I wasn't supposed to mention the surprise, but I let the cat out of the bag.")));

        IDIOM_LIST.add(new Idiom(8, 'b', "Burn The Midnight Oil", "To stay up late working or studying",
                List.of("She burned the midnight oil to finish her thesis before the deadline.",
                        "With exams approaching, students everywhere are burning the midnight oil.")));

        IDIOM_LIST.add(new Idiom(9, 'p', "Piece Of Cake", "Something that is very easy to do",
                List.of("The exam was a piece of cake compared to what I expected.",
                        "Learning to ride a bike was a piece of cake for him.")));

        IDIOM_LIST.add(new Idiom(10, 'u', "Under The Weather", "Feeling sick or unwell",
                List.of("I'm feeling a bit under the weather today, so I'll probably stay home.",
                        "She's been under the weather all week with a bad cold.")));
        IDIOM_LIST.add(new Idiom(11, 'd', "A Dime a Dozen", "Very common and of no particular value.",
                List.of("Smartphones are a dime a dozen now.",
                        "Good ideas like that are a dime a dozen.")));

        IDIOM_LIST.add(new Idiom(12, 'b', "Barking up the Wrong Tree", "To be pursuing a mistaken or misguided course of action; looking in the wrong place.",
                List.of("If you think I stole your pen, you're barking up the wrong tree.",
                        "The police were barking up the wrong tree until they found a new witness.")));

        IDIOM_LIST.add(new Idiom(13, 'c', "Call It a Day", "To stop working on something.",
                List.of("It's 5 PM, let's call it a day and finish this tomorrow.",
                        "I've been staring at this screen for hours; I'm going to call it a day.")));

        IDIOM_LIST.add(new Idiom(14, 'g', "Get Out of Hand", "To become uncontrollable.",
                List.of("The party started small but quickly got out of hand.",
                        "The argument got out of hand, and they had to be separated.")));

        IDIOM_LIST.add(new Idiom(15, 'h', "Hold Your Horses", "To wait or be patient.",
                List.of("Hold your horses! We can't start the presentation until the boss arrives.",
                        "Just hold your horses for a minute, I'm almost ready.")));

        IDIOM_LIST.add(new Idiom(16, 's', "In the Same Boat", "To be in the same difficult circumstances as others.",
                List.of("We're all facing budget cuts, so we're in the same boat.",
                        "Don't worry, we're all confused by the new rules; we're in the same boat.")));

        IDIOM_LIST.add(new Idiom(17, 'j', "Jump on the Bandwagon", "To join a popular activity or trend.",
                List.of("Everyone is starting a new hobby; I guess I'll jump on the bandwagon.",
                        "He only started supporting the team after they started winning, just jumping on the bandwagon.")));

        IDIOM_LIST.add(new Idiom(18, 'l', "Lend an Ear", "To listen sympathetically and carefully to someone.",
                List.of("I was having a rough day, and my friend was kind enough to lend an ear.",
                        "If you need to talk, I'm here to lend an ear.")));

        IDIOM_LIST.add(new Idiom(19, 'r', "Roll up Your Sleeves", "To prepare for hard work.",
                List.of("The deadline is tight, so we all need to roll up our sleeves and get started.",
                        "It's time to roll up our sleeves and tackle this project.")));

        IDIOM_LIST.add(new Idiom(20, 's', "See Eye to Eye", "To agree completely.",
                List.of("They often argue because they rarely see eye to eye on political matters.",
                        "I'm glad we see eye to eye on the design.")));
        IDIOM_LIST.add(new Idiom(21, 'a', "Add Fuel to the Fire", "To make a bad situation even worse.",
                List.of("Telling him he was right just added fuel to the fire, making the argument worse.",
                        "The company's defensive statement only added fuel to the fire of the public outcry.")));

        IDIOM_LIST.add(new Idiom(22, 'a', "All Ears", "Fully listening; paying close attention.",
                List.of("Tell me about your vacation, I'm all ears!",
                        "The students were all ears when the professor announced the final project.")));

        IDIOM_LIST.add(new Idiom(23, 'b', "Beat Around the Bush", "To avoid getting to the point; speaking indirectly.",
                List.of("Stop beating around the bush and tell me what you want.",
                        "She kept beating around the bush when talking about the real reason she quit.")));

        IDIOM_LIST.add(new Idiom(24, 'c', "Cut Corners", "To do something in the easiest, fastest, or cheapest way, often resulting in poor quality.",
                List.of("You can't cut corners when it comes to safety regulations.",
                        "The construction company cut corners, and now the building has structural problems.")));

        IDIOM_LIST.add(new Idiom(25, 'd', "Devil's Advocate", "A person who expresses a contentious opinion in order to provoke debate or test the strength of an argument.",
                List.of("I'll play devil's advocate for a moment and suggest an alternative plan.",
                        "She often takes on the role of devil's advocate to ensure all angles are considered.")));

        IDIOM_LIST.add(new Idiom(26, 'e', "Every Cloud Has a Silver Lining", "Every difficult or unpleasant situation has some hidden advantage or positive side.",
                List.of("Losing my job was tough, but every cloud has a silver lining; it forced me to start my own business.",
                        "I know you're disappointed, but remember, every cloud has a silver lining.")));

        IDIOM_LIST.add(new Idiom(27, 'g', "Get a Taste of Your Own Medicine", "To receive the same bad treatment that you have given to others.",
                List.of("After criticizing everyone else's work, he finally got a taste of his own medicine when his project failed.",
                        "It's about time he got a taste of his own medicine.")));

        IDIOM_LIST.add(new Idiom(28, 'h', "Head in the Clouds", "To be unrealistic, impractical, or day-dreaming.",
                List.of("He's a talented artist, but he has his head in the clouds when it comes to business.",
                        "She needs to take her head out of the clouds and face reality.")));

        IDIOM_LIST.add(new Idiom(29, 'o', "On the Ball", "Alert, capable, or competent.",
                List.of("The new manager is really on the ball and catches every mistake.",
                        "You need to be on the ball if you want to succeed in this industry.")));

        IDIOM_LIST.add(new Idiom(30, 't', "The Ball is in Your Court", "It is up to you to make the next decision or step.",
                List.of("I've given you all the information; the ball is in your court now.",
                        "They accepted the proposal, so the ball is in our court to sign the contract.")));
        IDIOM_LIST.add(new Idiom(31, 't', "Take a Rain Check", "To politely refuse an offer, with the implication that one may accept it at a later date.",
                List.of("I have a prior engagement, so I'll have to take a rain check on dinner tonight.",
                        "He said he was too busy this week but would take a rain check for next time.")));

        IDIOM_LIST.add(new Idiom(32, 'w', "Wrap Your Head Around It", "To comprehend something that is complicated or unusual.",
                List.of("It took me a while to wrap my head around the new software.",
                        "I still can't wrap my head around why they made that decision.")));

        IDIOM_LIST.add(new Idiom(33, 'u', "Up in the Air", "Uncertain or undecided.",
                List.of("Our travel plans are still up in the air due to the bad weather.",
                        "The future of the project is up in the air until we get the funding.")));

        IDIOM_LIST.add(new Idiom(34, 's', "Shoot the Breeze", "To have a casual conversation; to chat informally.",
                List.of("We spent the afternoon just shooting the breeze and catching up.",
                        "Let's grab a coffee and shoot the breeze for a while.")));

        IDIOM_LIST.add(new Idiom(35, 'h', "Hands Down", "Easily; without a doubt.",
                List.of("She is hands down the best singer in the competition.",
                        "That was hands down the easiest test I've ever taken.")));

        IDIOM_LIST.add(new Idiom(36, 'f', "Fit as a Fiddle", "In excellent health.",
                List.of("Despite his age, my grandfather is still as fit as a fiddle.",
                        "After a week of rest, she was back to being fit as a fiddle.")));

        IDIOM_LIST.add(new Idiom(37, 'e', "Every Dog Has Its Day", "Everyone gets a chance to succeed or be lucky at some point.",
                List.of("He finally won the championship. Every dog has its day!",
                        "Don't worry about this failure; every dog has its day.")));

        IDIOM_LIST.add(new Idiom(38, 'd', "Don't Judge a Book by Its Cover", "You shouldn't judge the value or quality of something by its outward appearance.",
                List.of("The restaurant looks small, but don't judge a book by its cover; the food is incredible.",
                        "He seems quiet, but you shouldn't judge a book by its cover.")));

        IDIOM_LIST.add(new Idiom(39, 'b', "Blink of an Eye", "A very short amount of time; quickly.",
                List.of("The summer vacation passed in the blink of an eye.",
                        "The car accident happened in the blink of an eye.")));

        IDIOM_LIST.add(new Idiom(40, 'a', "An Arm and a Leg", "Very expensive or costly.",
                List.of("That sports car cost him an arm and a leg.",
                        "The concert tickets cost an arm and a leg this year.")));
        IDIOM_LIST.add(new Idiom(41, 'b', "Back to the Drawing Board", "To start a task or project over again from the beginning, usually after a previous attempt failed.",
                List.of("The proposal was rejected, so we are back to the drawing board.",
                        "After the client changed the requirements, we had to go back to the drawing board.")));

        IDIOM_LIST.add(new Idiom(42, 'c', "Carry a Torch for Someone", "To be in love with someone who does not return the love; to have unrequited love.",
                List.of("Even years after the breakup, he still carries a torch for his ex-girlfriend.",
                        "She quietly carried a torch for the movie star she had never met.")));

        IDIOM_LIST.add(new Idiom(43, 'd', "Down to Earth", "Practical, realistic, and sensible.",
                List.of("Despite his success, he is very down to earth and easy to talk to.",
                        "We need a down to earth plan, not some fantasy.")));

        IDIOM_LIST.add(new Idiom(44, 'e', "Eager Beaver", "A person who is enthusiastic and hard-working.",
                List.of("The new intern is a real eager beaver, always the first to volunteer.",
                        "He works like an eager beaver to finish projects ahead of schedule.")));

        IDIOM_LIST.add(new Idiom(45, 'f', "Find Your Feet", "To become comfortable or accustomed to a new situation or environment.",
                List.of("It took her a few months to find her feet in the new city.",
                        "Don't worry, once you find your feet in the new job, it will get easier.")));

        IDIOM_LIST.add(new Idiom(46, 'g', "Go the Extra Mile", "To make an extra effort; to do more than what is strictly required.",
                List.of("The doctor always goes the extra mile to make his patients comfortable.",
                        "We need to go the extra mile to ensure customer satisfaction.")));

        IDIOM_LIST.add(new Idiom(47, 'h', "Hanging by a Thread", "In a very dangerous or precarious situation.",
                List.of("The company's financial situation is hanging by a thread.",
                        "His life was hanging by a thread after the serious accident.")));

        IDIOM_LIST.add(new Idiom(48, 'i', "In the Nick of Time", "Just in time; at the last possible moment.",
                List.of("The firefighter rescued the kitten from the tree in the nick of time.",
                        "We arrived at the airport in the nick of time before the gate closed.")));

        IDIOM_LIST.add(new Idiom(49, 'j', "Jumping the Gun", "To start something too soon or prematurely.",
                List.of("She started celebrating before the votes were counted, totally jumping the gun.",
                        "Let's wait for the official announcement before jumping the gun on the big purchase.")));

        IDIOM_LIST.add(new Idiom(50, 'k', "Keep Your Chin Up", "To remain cheerful or optimistic in difficult times.",
                List.of("I know things are tough, but keep your chin up!",
                        "She told him to keep his chin up after he failed the exam.")));
        IDIOM_LIST.add(new Idiom(51, 'l', "Look Before You Leap", "To consider all the potential risks and consequences before taking action.",
                List.of("Buying a house is a big decision; remember to look before you leap.",
                        "She decided to quit her job without a backup, forgetting to look before she leaped.")));

        IDIOM_LIST.add(new Idiom(52, 'm', "Make a Long Story Short", "To summarize or state something briefly.",
                List.of("To make a long story short, we got lost and missed the entire concert.",
                        "Make a long story short; why did you leave the party early?")));

        IDIOM_LIST.add(new Idiom(53, 'm', "Miss the Boat", "To miss an opportunity; to be too late to take advantage of something.",
                List.of("He waited too long to apply for the scholarship and completely missed the boat.",
                        "The concert tickets sold out fast; we definitely missed the boat.")));

        IDIOM_LIST.add(new Idiom(54, 'n', "Not My Cup of Tea", "Something that is not to one's liking or preference.",
                List.of("Hiking up a mountain is not my cup of tea; I prefer the beach.",
                        "While many people love reality TV, it's really not my cup of tea.")));

        IDIOM_LIST.add(new Idiom(55, 'o', "Once in a Blue Moon", "Very rarely.",
                List.of("We only eat fast food once in a blue moon; we prefer to cook at home.",
                        "She sees her brother only once in a blue moon since he moved abroad.")));

        IDIOM_LIST.add(new Idiom(56, 'p', "Play Devil's Advocate", "To argue against a proposition, not because one necessarily disagrees with it, but for the sake of argument or to test the validity of the proposition.",
                List.of("Let me play devil's advocate for a moment and point out the flaws in your plan.",
                        "The teacher asked a student to play devil's advocate to start a lively debate.")));

        IDIOM_LIST.add(new Idiom(57, 'p', "Pull Someone's Leg", "To joke with someone; to tease or trick them.",
                List.of("He told me he won the lottery, but I think he's just pulling my leg.",
                        "Don't worry, I didn't mean it; I was just pulling your leg.")));

        IDIOM_LIST.add(new Idiom(58, 'r', "Rain on Someone's Parade", "To spoil someone's pleasure or plans.",
                List.of("I hate to rain on your parade, but the boss needs that report by noon.",
                        "Don't let anyone rain on your parade when you announce your good news.")));

        IDIOM_LIST.add(new Idiom(59, 's', "Saving for a Rainy Day", "Saving money for a time when it might be needed unexpectedly.",
                List.of("It's important to have an emergency fund; you should always be saving for a rainy day.",
                        "She put a little bit of every paycheck away, saving for a rainy day.")));

        IDIOM_LIST.add(new Idiom(60, 's', "Speak of the Devil", "Said when a person appears immediately after being mentioned.",
                List.of("Speak of the devil, here comes our manager now!",
                        "We were just talking about Jane when she walked in—speak of the devil!")));
        IDIOM_LIST.add(new Idiom(61, 's', "Straight from the Horse's Mouth", "Information received directly from the most reliable source.",
                List.of("I know it's true because I heard it straight from the horse's mouth.",
                        "Don't rely on rumors; wait until you get the facts straight from the horse's mouth.")));

        IDIOM_LIST.add(new Idiom(62, 's', "Straw that Broke the Camel's Back", "The final minor irritation or problem that causes someone to lose patience or a system to collapse.",
                List.of("The constant noise was annoying, but the missed deadline was the straw that broke the camel's back.",
                        "After all the delays, the price increase was the straw that broke the camel's back for the customer.")));

        IDIOM_LIST.add(new Idiom(63, 't', "Take It With a Grain of Salt", "To not believe something completely; to maintain a degree of skepticism.",
                List.of("I would take his advice with a grain of salt; he tends to exaggerate.",
                        "The reviews for the film were mixed, so I took them with a grain of salt and watched it anyway.")));

        IDIOM_LIST.add(new Idiom(64, 't', "The Last Straw", "The final problem in a series of problems that makes a situation unbearable.",
                List.of("His rude comment was the last straw; I decided to leave the meeting.",
                        "After weeks of working overtime, the canceled holiday was the last straw for the employees.")));

        IDIOM_LIST.add(new Idiom(65, 't', "Throw in the Towel", "To give up; to admit defeat.",
                List.of("After losing the first three games, the team decided to throw in the towel.",
                        "I spent hours trying to fix the old computer before finally throwing in the towel and buying a new one.")));

        IDIOM_LIST.add(new Idiom(66, 't', "Through Thick and Thin", "Through good times and bad times; in spite of all difficulties.",
                List.of("A true friend stays with you through thick and thin.",
                        "The company has managed to survive through thick and thin over the past century.")));

        IDIOM_LIST.add(new Idiom(67, 't', "To Get Your Act Together", "To become organized or behave properly.",
                List.of("You need to get your act together if you want to pass this class.",
                        "After a rough start, the band finally got their act together for the tour.")));

        IDIOM_LIST.add(new Idiom(68, 'w', "When Pigs Fly", "Something that will never happen; impossible.",
                List.of("He'll clean his room when pigs fly.",
                        "They will agree to our demands when pigs fly; it's just not going to happen.")));

        IDIOM_LIST.add(new Idiom(69, 'w', "Whole Nine Yards", "Everything; the entire amount of something.",
                List.of("For his birthday party, she organized the whole nine yards: cake, decorations, and a DJ.",
                        "He gave them the whole nine yards of documents to prove his case.")));

        IDIOM_LIST.add(new Idiom(70, 'w', "Word of Mouth", "Information passed from person to person through speaking.",
                List.of("The restaurant relies on word of mouth advertising rather than expensive campaigns.",
                        "We found out about the job opening through word of mouth.")));
        IDIOM_LIST.add(new Idiom(71, 'a', "Actions Speak Louder Than Words", "What you do is more important than what you say.",
                List.of("The manager promised a bonus, but until we see the money, actions speak louder than words.",
                        "She apologized, but actions speak louder than words; she needs to change her behavior.")));

        IDIOM_LIST.add(new Idiom(72, 'b', "Better Late Than Never", "It is better to do something late than not at all.",
                List.of("He finally submitted his application, better late than never!",
                        "They finished the project a week late, but better late than never.")));

        IDIOM_LIST.add(new Idiom(73, 'b', "Birds of a Feather Flock Together", "People with similar tastes, interests, or characters tend to associate with one another.",
                List.of("All the musicians hang out in the same cafe; birds of a feather flock together.",
                        "It’s no surprise they are best friends; they have so much in common. Birds of a feather flock together.")));

        IDIOM_LIST.add(new Idiom(74, 'c', "Cold Feet", "To feel nervous or anxious about something, especially an important event like a wedding or a commitment.",
                List.of("He got cold feet the day before the wedding and almost didn't show up.",
                        "Don't get cold feet now; we're ready to launch the business.")));

        IDIOM_LIST.add(new Idiom(75, 'c', "Cry Over Spilled Milk", "To regret or worry about something that has already happened and cannot be changed.",
                List.of("The mistake is already made, so there's no use crying over spilled milk.",
                        "Don't cry over spilled milk; let's figure out how to do better next time.")));

        IDIOM_LIST.add(new Idiom(76, 'd', "Don't Put All Your Eggs in One Basket", "Don't concentrate all your efforts or resources in one area, as you could lose everything.",
                List.of("You should apply to several universities; don't put all your eggs in one basket.",
                        "She invested her money in a few different places, wisely not putting all her eggs in one basket.")));

        IDIOM_LIST.add(new Idiom(77, 'd', "Drive Someone Up the Wall", "To annoy or irritate someone greatly.",
                List.of("That loud music is driving me up the wall!",
                        "His constant complaining drives everyone up the wall.")));

        IDIOM_LIST.add(new Idiom(78, 'e', "Elephant in the Room", "An obvious problem or difficult situation that everyone knows about but no one wants to discuss.",
                List.of("We finally had to address the elephant in the room: the company's financial crisis.",
                        "During the family dinner, nobody mentioned the divorce—it was the elephant in the room.")));

        IDIOM_LIST.add(new Idiom(79, 'g', "Give Someone the Cold Shoulder", "To intentionally ignore someone or treat them in an unfriendly way.",
                List.of("After the argument, she gave him the cold shoulder for a week.",
                        "I said hello, but he gave me the cold shoulder and walked away.")));

        IDIOM_LIST.add(new Idiom(80, 'h', "Hit the Nail on the Head", "To describe exactly what is causing a situation or problem.",
                List.of("You hit the nail on the head with your analysis of the company’s biggest weakness.",
                        "When she suggested better communication, she hit the nail on the head.")));
        IDIOM_LIST.add(new Idiom(81, 'h', "Hold the Fort", "To take temporary responsibility for a place or situation while the person in charge is absent.",
                List.of("The manager is away this week, so I'm holding the fort.",
                        "Can you hold the fort while I step out for lunch?")));

        IDIOM_LIST.add(new Idiom(82, 'i', "In a Nutshell", "To summarize, briefly and concisely.",
                List.of("In a nutshell, the merger means we all have new roles.",
                        "The book is about a hero's journey; that's it in a nutshell.")));

        IDIOM_LIST.add(new Idiom(83, 'k', "Keep an Eye On", "To watch carefully; to monitor or supervise.",
                List.of("Can you keep an eye on the oven while I'm on the phone?",
                        "The security guard keeps an eye on the entrance at all times.")));

        IDIOM_LIST.add(new Idiom(84, 'l', "Lose Your Touch", "To no longer be able to do something skillfully or effectively as one could before.",
                List.of("He used to be a great salesman, but lately, he seems to have lost his touch.",
                        "I haven't played the piano in years; I've definitely lost my touch.")));

        IDIOM_LIST.add(new Idiom(85, 'm', "Make Waves", "To cause trouble or excitement; to challenge the status quo.",
                List.of("The new CEO is starting to make waves with her radical changes.",
                        "He tends to make waves in every committee meeting by asking tough questions.")));

        IDIOM_LIST.add(new Idiom(86, 'n', "No Pain, No Gain", "Suffering or effort is necessary to achieve something worthwhile.",
                List.of("You'll never get strong if you don't push yourself—no pain, no gain!",
                        "Waking up early to study is hard, but no pain, no gain.")));

        IDIOM_LIST.add(new Idiom(87, 'o', "On Cloud Nine", "Extremely happy; ecstatic.",
                List.of("She's been on cloud nine ever since she won the competition.",
                        "When they announced the new baby, the whole family was on cloud nine.")));

        IDIOM_LIST.add(new Idiom(88, 'p', "Paint the Town Red", "To go out and celebrate exuberantly; to have a lively, festive outing.",
                List.of("After finishing their exams, the students decided to paint the town red.",
                        "Let's go downtown tonight and paint the town red!")));

        IDIOM_LIST.add(new Idiom(89, 's', "Sleep On It", "To delay a decision until the next day in order to have more time to think about it.",
                List.of("I can't decide right now; I need to sleep on it.",
                        "Don't sign the contract immediately; sleep on it first.")));

        IDIOM_LIST.add(new Idiom(90, 't', "The Best of Both Worlds", "A situation in which you can enjoy the benefits of two different, contrasting things.",
                List.of("Working from home allows me to have the best of both worlds: a career and time with my family.",
                        "The apartment is quiet but close to the city, offering the best of both worlds.")));
        IDIOM_LIST.add(new Idiom(91, 't', "Through the Grapevine", "Hearing news or information informally, by rumor or gossip.",
                List.of("I heard through the grapevine that the company is moving its headquarters.",
                        "Don't trust the gossip you hear through the grapevine; it might not be true.")));

        IDIOM_LIST.add(new Idiom(92, 't', "Time Flies When You're Having Fun", "Time seems to pass quickly when you are enjoying yourself.",
                List.of("It's midnight already? Time flies when you're having fun!",
                        "We spent the whole day talking; time really flies when you're having fun.")));

        IDIOM_LIST.add(new Idiom(93, 't', "To Steal Someone's Thunder", "To take credit for someone else's idea or achievement; to divert attention to oneself.",
                List.of("She announced her promotion right after I finished my presentation, totally stealing my thunder.",
                        "The rival company tried to steal our thunder by releasing a similar product a day earlier.")));

        IDIOM_LIST.add(new Idiom(94, 't', "To Get Your Feet Wet", "To begin to gain experience in a particular area of activity.",
                List.of("I'm starting with small tasks just to get my feet wet in the new role.",
                        "The internship is a great way to get your feet wet in the publishing industry.")));

        IDIOM_LIST.add(new Idiom(95, 't', "Turn a Blind Eye", "To intentionally ignore a situation or behavior that you know is wrong.",
                List.of("The security guard was criticized for turning a blind eye to the vandalism.",
                        "He turned a blind eye to his colleague's constant lateness.")));

        IDIOM_LIST.add(new Idiom(96, 'u', "Under the Table", "Done secretly or illegally, often referring to a cash transaction to avoid tax.",
                List.of("They paid the worker under the table to avoid paying proper taxes and benefits.",
                        "The bribe was offered under the table to influence the decision.")));

        IDIOM_LIST.add(new Idiom(97, 'w', "Walk on Eggshells", "To be very careful and cautious in one's actions or words to avoid offending someone.",
                List.of("Ever since the argument, I've had to walk on eggshells around him.",
                        "The employees feel like they have to walk on eggshells when the demanding client is visiting.")));

        IDIOM_LIST.add(new Idiom(98, 'w', "Wear Your Heart on Your Sleeve", "To openly and freely express your emotions rather than keeping them hidden.",
                List.of("She is a person who always wears her heart on her sleeve; you always know how she feels.",
                        "He wears his heart on his sleeve, so his joy and pain are visible to everyone.")));

        IDIOM_LIST.add(new Idiom(99, 'w', "Worth Its Weight in Gold", "Extremely valuable or useful.",
                List.of("The new assistant is worth his weight in gold; he saves me so much time.",
                        "This vintage recipe book is worth its weight in gold to the collector.")));

        IDIOM_LIST.add(new Idiom(100, 'y', "You Can't Teach an Old Dog New Tricks", "It is difficult to change a person's established habits or way of thinking.",
                List.of("My grandfather won't learn how to use a smartphone; you can't teach an old dog new tricks.",
                        "The company struggled to adapt to the new technology because, frankly, you can't teach an old dog new tricks.")));
        IDIOM_LIST.add(new Idiom(101, 'a', "Ace in the Hole", "A secret or hidden strength, advantage, or resource.",
                List.of("The unexpected witness was the defense lawyer's ace in the hole.",
                        "Our backup plan is our ace in the hole if the primary strategy fails.")));

        IDIOM_LIST.add(new Idiom(102, 'b', "Bite Off More Than You Can Chew", "To attempt a task that is too large or difficult to handle.",
                List.of("He agreed to manage both teams at once and soon realized he had bitten off more than he could chew.",
                        "Don't bite off more than you can chew with that huge project.")));

        IDIOM_LIST.add(new Idiom(103, 'b', "By the Skin of Your Teeth", "Just barely succeeding or narrowly escaping a disaster.",
                List.of("He passed the exam by the skin of his teeth.",
                        "We caught the train by the skin of our teeth.")));

        IDIOM_LIST.add(new Idiom(104, 'c', "Compare Apples to Oranges", "To compare two items that are fundamentally different and thus cannot be reasonably compared.",
                List.of("Trying to compare their small startup to our large corporation is like comparing apples to oranges.",
                        "You can't compare the cost of living in the city to the countryside; it's comparing apples to oranges.")));

        IDIOM_LIST.add(new Idiom(105, 'c', "Cut to the Chase", "To get to the point without wasting time on preliminaries.",
                List.of("Stop all the small talk and just cut to the chase—what do you want?",
                        "The presentation was too long, so the manager asked him to cut to the chase.")));

        IDIOM_LIST.add(new Idiom(106, 'd', "Don't Look a Gift Horse in the Mouth", "Don't criticize or refuse something good that is freely offered.",
                List.of("They offered you a free ticket to the concert, so don't look a gift horse in the mouth.",
                        "Even if the apartment is small, don't look a gift horse in the mouth; it's free rent!")));

        IDIOM_LIST.add(new Idiom(107, 'f', "Forever and a Day", "A very long or seemingly endless period of time.",
                List.of("It feels like I've been waiting for this bus forever and a day.",
                        "They promised to love each other for forever and a day.")));

        IDIOM_LIST.add(new Idiom(108, 'g', "Give the Benefit of the Doubt", "To believe someone's statement, even if you are unsure if it is true, or to assume a person is innocent rather than guilty.",
                List.of("I didn't see what happened, so I decided to give him the benefit of the doubt.",
                        "She was late, but I'll give her the benefit of the doubt that her train was delayed.")));

        IDIOM_LIST.add(new Idiom(109, 'h', "Have Bigger Fish to Fry", "To have more important or pressing things to deal with.",
                List.of("I can't worry about that small error right now; I have bigger fish to fry.",
                        "He said he was too busy to attend the meeting; he must have bigger fish to fry.")));

        IDIOM_LIST.add(new Idiom(110, 'i', "Ignorance is Bliss", "Not knowing something is often better than knowing it, as knowledge may cause stress or worry.",
                List.of("Sometimes I wish I didn't know about all the office gossip; ignorance is bliss.",
                        "She never checks her credit score because she prefers to believe ignorance is bliss.")));
        IDIOM_LIST.add(new Idiom(111, 'i', "In the Same Breath", "If you say two contradictory things in the same breath, you say them almost at the same time.",
                List.of("He criticized the report and then praised the team's work in the same breath.",
                        "She said she was busy but then offered to help, contradicting herself in the same breath.")));

        IDIOM_LIST.add(new Idiom(112, 'k', "Keep Your Shirt On", "To stay calm and not get angry or impatient.",
                List.of("Keep your shirt on! I'll be there to help in five minutes.",
                        "The customer was yelling, but the clerk told him to keep his shirt on.")));

        IDIOM_LIST.add(new Idiom(113, 'l', "Let Sleeping Dogs Lie", "To leave a situation undisturbed because getting involved could cause trouble.",
                List.of("The dispute happened years ago; it’s best to let sleeping dogs lie.",
                        "Don't bring up the past issue with the budget; just let sleeping dogs lie.")));

        IDIOM_LIST.add(new Idiom(114, 'm', "Mad as a Hatter", "Completely crazy or eccentric.",
                List.of("He wears socks with sandals and talks to squirrels; he's mad as a hatter.",
                        "The inventor's ideas seemed mad as a hatter until one of them actually worked.")));

        IDIOM_LIST.add(new Idiom(115, 'o', "On the Fence", "Undecided about two possible choices.",
                List.of("I'm still on the fence about whether to take the new job or stay put.",
                        "The committee is on the fence regarding the best course of action.")));

        IDIOM_LIST.add(new Idiom(116, 'p', "Pass the Buck", "To shift blame or responsibility to another person.",
                List.of("The manager always tries to pass the buck when a project fails.",
                        "Stop passing the buck and take responsibility for your error.")));

        IDIOM_LIST.add(new Idiom(117, 'q', "Quick on the Draw", "Quick to react or respond to a situation.",
                List.of("The security guard was quick on the draw and stopped the thief immediately.",
                        "You have to be quick on the draw in a debate to counter arguments effectively.")));

        IDIOM_LIST.add(new Idiom(118, 'r', "Read Between the Lines", "To discern a hidden meaning or message that is not explicitly stated.",
                List.of("The letter sounded positive, but if you read between the lines, they are planning layoffs.",
                        "You have to read between the lines to understand the true feelings of the speaker.")));

        IDIOM_LIST.add(new Idiom(119, 's', "Sell Like Hotcakes", "To be sold quickly and in large quantities.",
                List.of("The new game console is selling like hotcakes this holiday season.",
                        "The tickets to the concert sold like hotcakes within minutes of going on sale.")));

        IDIOM_LIST.add(new Idiom(120, 't', "Take the Plunge", "To commit to a course of action that is difficult or risky.",
                List.of("After years of planning, they finally decided to take the plunge and start their own business.",
                        "It's scary, but it's time to take the plunge and move to a new country.")));
        IDIOM_LIST.add(new Idiom(121, 'u', "Under the Wire", "At the last possible moment; barely on time.",
                List.of("We submitted the grant proposal right under the wire.",
                        "She made it to the appointment under the wire.")));

        IDIOM_LIST.add(new Idiom(122, 'w', "Water Under the Bridge", "Something that happened in the past and is now over and forgotten.",
                List.of("Our old arguments are water under the bridge now.",
                        "I forgave her long ago; it's all just water under the bridge.")));

        IDIOM_LIST.add(new Idiom(123, 'w', "Wear Many Hats", "To have many different roles or responsibilities.",
                List.of("As a small business owner, she has to wear many hats.",
                        "In our small department, everyone wears many hats to get the job done.")));

        IDIOM_LIST.add(new Idiom(124, 'a', "Apple of My Eye", "The person or thing one loves most; a favorite.",
                List.of("His youngest daughter is the apple of his eye.",
                        "That vintage car is the apple of my eye.")));

        IDIOM_LIST.add(new Idiom(125, 'b', "Break a Leg", "A theatrical term meaning 'good luck'.",
                List.of("You're going to do great tonight—break a leg!",
                        "Before the audition, the director told each actor to break a leg.")));

        IDIOM_LIST.add(new Idiom(126, 'b', "Burn Bridges", "To destroy relationships or opportunities, making it impossible to return.",
                List.of("Don't quit your job by insulting your boss; never burn bridges.",
                        "By lying to his team, he burned his bridges in the company.")));

        IDIOM_LIST.add(new Idiom(127, 'c', "Carry On", "To continue doing what one has been doing.",
                List.of("Despite the disruption, the teacher told the students to carry on with their work.",
                        "If you can't join us, we'll carry on without you.")));

        IDIOM_LIST.add(new Idiom(128, 'c', "Chew the Fat", "To chat idly or generally waste time talking.",
                List.of("We spent the evening just sitting on the porch and chewing the fat.",
                        "The neighbors meet every morning to chew the fat over coffee.")));

        IDIOM_LIST.add(new Idiom(129, 'd', "Dog Days of Summer", "The hottest days of the summer.",
                List.of("It's hard to be productive during the dog days of summer.",
                        "We spent the dog days of summer relaxing by the pool.")));

        IDIOM_LIST.add(new Idiom(130, 'e', "Easy Does It", "Slow down; proceed carefully.",
                List.of("That box is fragile, so easy does it!",
                        "Easy does it when you're learning a new skill; take your time.")));

        IDIOM_LIST.add(new Idiom(131, 'g', "Go Against the Grain", "To do something contrary to the conventional way.",
                List.of("His ideas always go against the grain of traditional management.",
                        "She likes to go against the grain and challenge popular opinion.")));

        IDIOM_LIST.add(new Idiom(132, 'h', "Hanging Out to Dry", "Abandoning or neglecting someone in a difficult situation.",
                List.of("When the scandal broke, his former colleagues left him hanging out to dry.",
                        "I felt like my business partner hung me out to dry by quitting unexpectedly.")));

        IDIOM_LIST.add(new Idiom(133, 'i', "In a Pickle", "In a difficult or messy situation.",
                List.of("I forgot my wallet and my keys, so I'm really in a pickle now.",
                        "The unexpected rain left us in a pickle with all the outside equipment.")));

        IDIOM_LIST.add(new Idiom(134, 'j', "Jumping for Joy", "Being extremely happy; thrilled.",
                List.of("When she heard she got the job, she was literally jumping for joy.",
                        "The whole town was jumping for joy after the team won the championship.")));

        IDIOM_LIST.add(new Idiom(135, 'k', "Know the Ropes", "To be familiar with the details and procedures of an activity or job.",
                List.of("The new employee is learning fast and will know the ropes in no time.",
                        "I don't need help; I know the ropes around here.")));

        IDIOM_LIST.add(new Idiom(136, 'l', "Live and Learn", "To accept that you have made a mistake and adjust your behavior in the future.",
                List.of("I didn't back up my files and lost everything. Well, live and learn.",
                        "It was a bad investment, but I live and learn from my errors.")));

        IDIOM_LIST.add(new Idiom(137, 'm', "Money Talks", "Wealth gives a person or organization power and influence.",
                List.of("They got the prime location because, in this town, money talks.",
                        "It's unfair, but money talks when it comes to getting special treatment.")));

        IDIOM_LIST.add(new Idiom(138, 'n', "No Dice", "An emphatic refusal; no way.",
                List.of("I asked if I could leave early, but the boss said no dice.",
                        "We tried to get the exclusive contract, but it was no dice.")));

        IDIOM_LIST.add(new Idiom(139, 'o', "Off the Hook", "Free from blame, responsibility, or obligation.",
                List.of("Since the new witness came forward, the suspect is completely off the hook.",
                        "You're off the hook for covering the shift tonight; someone else volunteered.")));

        IDIOM_LIST.add(new Idiom(140, 'o', "Over the Moon", "Extremely happy; delighted.",
                List.of("She was over the moon about her engagement ring.",
                        "The children were over the moon when they got a new puppy.")));
        IDIOM_LIST.add(new Idiom(141, 'p', "Pad the Bill", "To add extra, unnecessary charges to a bill or expense report.",
                List.of("The mechanic was caught padding the bill with unnecessary labor hours.",
                        "Be careful when reviewing their invoices, they often try to pad the bill.")));

        IDIOM_LIST.add(new Idiom(142, 'p', "Pass With Flying Colors", "To pass a test, examination, or course easily and with a very high score.",
                List.of("She studied all night and passed her final exam with flying colors.",
                        "The team completed the safety inspection with flying colors.")));

        IDIOM_LIST.add(new Idiom(143, 'q', "Quid Pro Quo", "A favor or advantage granted or expected in return for something else; a swap.",
                List.of("The agreement was based on a quid pro quo: I help you, and you help me.",
                        "There was no quid pro quo involved; it was a pure donation.")));

        IDIOM_LIST.add(new Idiom(144, 'r', "Raining Cats and Dogs", "Raining extremely heavily.",
                List.of("We couldn't go for a walk because it was raining cats and dogs.",
                        "Take an umbrella; it's raining cats and dogs outside.")));

        IDIOM_LIST.add(new Idiom(145, 's', "Shape Up or Ship Out", "Either improve one's behavior or performance or leave the job/situation.",
                List.of("The coach warned the player to shape up or ship out after his poor performance.",
                        "The company told the unproductive workers to shape up or ship out.")));

        IDIOM_LIST.add(new Idiom(146, 's', "Shoot Yourself in the Foot", "To hurt your own cause or interest unintentionally.",
                List.of("He shot himself in the foot by bragging about his salary during negotiations.",
                        "By rejecting the easy option, we might shoot ourselves in the foot.")));

        IDIOM_LIST.add(new Idiom(147, 's', "Sight for Sore Eyes", "A person or thing that one is extremely happy or relieved to see.",
                List.of("After a long journey, the hotel room was a sight for sore eyes.",
                        "My daughter was a sight for sore eyes when she finally returned home.")));

        IDIOM_LIST.add(new Idiom(148, 's', "Skate on Thin Ice", "To be in a risky situation; to be doing something dangerous or likely to get one in trouble.",
                List.of("He's skating on thin ice with his frequent absences from work.",
                        "After his last warning, he knows he's skating on thin ice.")));

        IDIOM_LIST.add(new Idiom(149, 's', "Snug as a Bug in a Rug", "Very comfortable and cozy.",
                List.of("The baby looked snug as a bug in a rug wrapped in her blanket.",
                        "We were all snug as a bug in a rug by the fireplace.")));

        IDIOM_LIST.add(new Idiom(150, 't', "Take the Heat", "To endure the criticism or blame for something.",
                List.of("Someone has to take the heat for the failure of the campaign.",
                        "The captain had to take the heat from the fans after the loss.")));

        IDIOM_LIST.add(new Idiom(151, 't', "Taste of Your Own Medicine", "To experience the same unpleasantness or bad treatment that you have given to others.",
                List.of("After always making fun of others, he finally got a taste of his own medicine.",
                        "It's about time she got a taste of her own medicine for being so rude.")));

        IDIOM_LIST.add(new Idiom(152, 't', "The Elephant in the Room", "An obvious problem or difficult situation that everyone knows about but no one wants to discuss.",
                List.of("No one mentioned the company's bankruptcy—it was the elephant in the room.",
                        "The budget deficit became the elephant in the room at the board meeting.")));

        IDIOM_LIST.add(new Idiom(153, 't', "Throw Caution to the Wind", "To act recklessly or without regard to prudence.",
                List.of("Tired of following the rules, they threw caution to the wind and went bungee jumping.",
                        "We decided to throw caution to the wind and book the expensive trip.")));

        IDIOM_LIST.add(new Idiom(154, 'u', "Up in Arms", "Very angry; protesting vehemently.",
                List.of("The local residents were up in arms about the new construction plans.",
                        "When the fees were raised, the students were up in arms.")));

        IDIOM_LIST.add(new Idiom(155, 'w', "Whole Nine Yards", "Everything; the entire amount or distance.",
                List.of("When they renovated the kitchen, they went the whole nine yards with new appliances and cabinets.",
                        "Tell me about your trip—the whole nine yards.")));

        IDIOM_LIST.add(new Idiom(156, 'w', "Wild Goose Chase", "A hopeless, complicated, or aimless search for something.",
                List.of("We followed the incorrect directions for hours—it was a real wild goose chase.",
                        "Sending me to three different offices for one signature felt like a wild goose chase.")));

        IDIOM_LIST.add(new Idiom(157, 'a', "Add Insult to Injury", "To make a bad situation worse.",
                List.of("First the tire went flat, then to add insult to injury, it started to rain.",
                        "The restaurant lost his reservation, and then, to add insult to injury, they charged him for the wait.")));

        IDIOM_LIST.add(new Idiom(158, 'b', "Behind the Eight Ball", "In a difficult or disadvantageous position.",
                List.of("After missing the first deadline, we are now behind the eight ball.",
                        "The new legislation put the small businesses behind the eight ball.")));

        IDIOM_LIST.add(new Idiom(159, 'c', "Cat Got Your Tongue?", "Why are you not speaking? (Often said to someone who is silent when expected to speak).",
                List.of("When the teacher asked for your name, what happened? Cat got your tongue?",
                        "He was very chatty, but now that the boss is here, cat got his tongue.")));

        IDIOM_LIST.add(new Idiom(160, 'c', "Chalk it Up to Experience", "To consider a failure or loss as a valuable learning experience.",
                List.of("The project failed, but let's just chalk it up to experience and learn from it.",
                        "He lost money on the stock, but he decided to chalk it up to experience.")));
        IDIOM_LIST.add(new Idiom(161, 'd', "Dead Ringer", "A person or thing that is an exact duplicate or look-alike of another.",
                List.of("He's a dead ringer for his grandfather when he was young.",
                        "That car is a dead ringer for a classic model, but it's new.")));

        IDIOM_LIST.add(new Idiom(162, 'd', "Drastic Times Call for Drastic Measures", "Extreme situations require extreme actions.",
                List.of("We had to sell the company car to pay the debt—drastic times call for drastic measures.",
                        "With the deadline tomorrow, working all night felt like a case where drastic times call for drastic measures.")));

        IDIOM_LIST.add(new Idiom(163, 'f', "Face the Music", "To accept the unpleasant consequences of one's actions.",
                List.of("He finally had to face the music and confess to his parents what he had done.",
                        "The company will have to face the music when the auditor arrives.")));

        IDIOM_LIST.add(new Idiom(164, 'f', "Feather in Your Cap", "An achievement or something to be proud of.",
                List.of("Publishing that research paper was a real feather in her cap.",
                        "Winning the award was a big feather in the company's cap.")));

        IDIOM_LIST.add(new Idiom(165, 'f', "Fiddle While Rome Burns", "To focus on trivial matters while ignoring a crisis.",
                List.of("The board spent an hour debating the color of the office carpet, essentially fiddling while Rome burned.",
                        "Stop worrying about minor details; we can't fiddle while Rome burns.")));

        IDIOM_LIST.add(new Idiom(166, 'f', "Forty Winks", "A short sleep or nap.",
                List.of("I'm going to grab forty winks before I start my night shift.",
                        "He took forty winks on the sofa and felt much better.")));

        IDIOM_LIST.add(new Idiom(167, 'g', "Get a Second Wind", "A renewed burst of energy or motivation after being tired.",
                List.of("I was exhausted halfway through the marathon, but then I got my second wind.",
                        "After a coffee break, the team got a second wind and finished the report quickly.")));

        IDIOM_LIST.add(new Idiom(168, 'g', "Go Down in Flames", "To fail dramatically or spectacularly.",
                List.of("Their new marketing campaign went down in flames after the public backlash.",
                        "The business idea went down in flames when the main investor pulled out.")));

        IDIOM_LIST.add(new Idiom(169, 'h', "Hard Pill to Swallow", "A situation or piece of information that is difficult or unpleasant to accept.",
                List.of("The news of the budget cuts was a hard pill to swallow for the department.",
                        "Admitting his mistake was a hard pill to swallow for the proud executive.")));

        IDIOM_LIST.add(new Idiom(170, 'i', "In the Doghouse", "In disgrace or in trouble.",
                List.of("He forgot his wife's birthday and has been in the doghouse all week.",
                        "The player is in the doghouse with the coach after missing practice.")));

        IDIOM_LIST.add(new Idiom(171, 'k', "Keep a Straight Face", "To manage to look serious and avoid laughing.",
                List.of("The comedian was so funny it was hard to keep a straight face.",
                        "She tried to keep a straight face while telling the ridiculous story.")));

        IDIOM_LIST.add(new Idiom(172, 'l', "Last But Not Least", "A phrase used to introduce the final item in a list, indicating it is just as important as the others.",
                List.of("And now, last but not least, let's thank our sponsor.",
                        "My guests included John, Sarah, and last but not least, my brother Tom.")));

        IDIOM_LIST.add(new Idiom(173, 'm', "Make Ends Meet", "To earn just enough money to live on.",
                List.of("After losing his job, he struggled to make ends meet.",
                        "Many students work part-time just to make ends meet.")));

        IDIOM_LIST.add(new Idiom(174, 'm', "Method to the Madness", "A purpose or reason behind seemingly irrational behavior or actions.",
                List.of("I know his workflow looks chaotic, but there's a method to the madness.",
                        "At first, the painting seemed random, but the artist insisted there was a method to the madness.")));

        IDIOM_LIST.add(new Idiom(175, 'n', "Nest Egg", "A sum of money saved for a specific purpose, often for retirement.",
                List.of("They are building a nest egg to fund their children's college education.",
                        "His retirement nest egg is substantial after decades of saving.")));

        IDIOM_LIST.add(new Idiom(176, 'o', "Off the Top of My Head", "Spontaneously, without careful thought or checking records.",
                List.of("I can't tell you the exact figures off the top of my head.",
                        "Off the top of my head, I'd say we need about fifty chairs.")));

        IDIOM_LIST.add(new Idiom(177, 'p', "Practice Makes Perfect", "Regular exercise of an activity or skill is the way to become proficient in it.",
                List.of("Don't worry if you fail the first time; practice makes perfect.",
                        "She continues to rehearse the song, knowing that practice makes perfect.")));

        IDIOM_LIST.add(new Idiom(178, 'p', "Put All Your Eggs in One Basket", "To risk everything on one venture or resource (the negative version of the earlier idiom).",
                List.of("He invested all his savings in that one risky stock, putting all his eggs in one basket.",
                        "It's unwise to put all your eggs in one basket when looking for a job.")));

        IDIOM_LIST.add(new Idiom(179, 'r', "Rule of Thumb", "A broadly accurate guide or principle, based on experience or practice rather than theory.",
                List.of("As a rule of thumb, you should save 10% of your income.",
                        "The rule of thumb for this recipe is to double the cooking time for a bigger turkey.")));

        IDIOM_LIST.add(new Idiom(180, 's', "See Eye to Eye", "To agree completely.",
                List.of("They rarely argue because they see eye to eye on most important issues.",
                        "We don't always see eye to eye, but we respect each other's opinions.")));
        IDIOM_LIST.add(new Idiom(181, 's', "Sell Yourself Short", "To underestimate one's own worth or abilities; to accept less than one deserves.",
                List.of("Don't sell yourself short in the salary negotiation; you deserve that raise.",
                        "She is so talented, but she often sells herself short by being too modest.")));

        IDIOM_LIST.add(new Idiom(182, 's', "Silver Lining", "A sign of hope in an unfortunate or gloomy situation.",
                List.of("The long-term silver lining of the disaster was the community coming together.",
                        "Even in a tough year, there's always a silver lining if you look for it.")));

        IDIOM_LIST.add(new Idiom(183, 's', "Six of One, Half Dozen of the Other", "Two alternatives that are essentially the same; it makes no difference which one is chosen.",
                List.of("Whether we meet on Tuesday or Wednesday, it's six of one, half dozen of the other.",
                        "They can use the old system or the new one; it's six of one, half dozen of the other.")));

        IDIOM_LIST.add(new Idiom(184, 's', "Smell a Rat", "To suspect that something is wrong or dishonest.",
                List.of("When the accountant suddenly resigned, the owner started to smell a rat.",
                        "I paid the full price, but the product quality makes me smell a rat.")));

        IDIOM_LIST.add(new Idiom(185, 's', "Speak of the Devil", "Said when a person appears immediately after being mentioned.",
                List.of("We were just talking about Jane when she walked in—speak of the devil!",
                        "Speak of the devil, here comes our manager now!")));

        IDIOM_LIST.add(new Idiom(186, 's', "Square Peg in a Round Hole", "A person who is clearly unsuited to the situation or job they are in.",
                List.of("He's a creative artist stuck in a bureaucratic job; he's a square peg in a round hole.",
                        "Trying to force that solution onto the problem is like putting a square peg in a round hole.")));

        IDIOM_LIST.add(new Idiom(187, 't', "Take the Bull by the Horns", "To deal with a difficult, unpleasant, or dangerous situation bravely and directly.",
                List.of("Instead of procrastinating, she decided to take the bull by the horns and finish the project.",
                        "It's time for us to take the bull by the horns and confront the issue.")));

        IDIOM_LIST.add(new Idiom(188, 't', "The Early Bird Gets the Worm", "Success comes to those who prepare well and arrive or act early.",
                List.of("If you want the best seat at the show, remember the early bird gets the worm.",
                        "We started marketing early because the early bird gets the worm.")));

        IDIOM_LIST.add(new Idiom(189, 't', "The Last Straw", "The final problem in a series of problems that causes someone to lose patience.",
                List.of("His rude comment was the last straw; I decided to quit.",
                        "The excessive fee was the last straw that made the customer switch providers.")));

        IDIOM_LIST.add(new Idiom(190, 't', "Through Thick and Thin", "Through good times and bad times; in spite of all difficulties.",
                List.of("They have been friends through thick and thin for over twenty years.",
                        "Our marriage has endured through thick and thin.")));

        IDIOM_LIST.add(new Idiom(191, 't', "Throw in the Towel", "To give up; to admit defeat.",
                List.of("After hours of trying to fix the car, I finally threw in the towel and called a mechanic.",
                        "The politician refused to throw in the towel, even after losing the primary vote.")));

        IDIOM_LIST.add(new Idiom(192, 't', "Tie the Knot", "To get married.",
                List.of("They are planning to tie the knot next summer in Hawaii.",
                        "We decided to tie the knot in a small ceremony.")));

        IDIOM_LIST.add(new Idiom(193, 't', "Too Many Cooks Spoil the Broth", "If too many people are involved in a task, it will be poorly done.",
                List.of("The design team had too many opinions; it proved that too many cooks spoil the broth.",
                        "Let's limit the decisions to two people; we don't want too many cooks spoiling the broth.")));

        IDIOM_LIST.add(new Idiom(194, 'u', "Under the Gun", "Under pressure or stress, typically because of an approaching deadline.",
                List.of("We are under the gun to finish this report before the end of the day.",
                        "The team is always under the gun during tax season.")));

        IDIOM_LIST.add(new Idiom(195, 'w', "Warm the Cockles of Your Heart", "To cause a feeling of pleasure, contentment, or warmth.",
                List.of("The unexpected gift truly warmed the cockles of her heart.",
                        "Seeing the old friends reunite was a sight that warmed the cockles of my heart.")));

        IDIOM_LIST.add(new Idiom(196, 'w', "Water Under the Bridge", "Something that happened in the past and is now over and forgotten.",
                List.of("Our disagreement from last year is water under the bridge now.",
                        "He said he has no hard feelings; it's all water under the bridge.")));

        IDIOM_LIST.add(new Idiom(197, 'w', "Whole Nine Yards", "Everything; the entire amount or extent.",
                List.of("We ordered pizza, wings, and soda—the whole nine yards.",
                        "She studied the whole nine yards of the material for the test.")));

        IDIOM_LIST.add(new Idiom(198, 'w', "Witch Hunt", "An intensive, often paranoid, effort to find and expose disloyal or undesirable people.",
                List.of("The investigation felt more like a witch hunt targeting one specific department.",
                        "The media called the politician's pursuit of whistleblowers a witch hunt.")));

        IDIOM_LIST.add(new Idiom(199, 'w', "Wrap Up", "To complete or finish something.",
                List.of("Let's wrap up this meeting and head to lunch.",
                        "They need one more day to wrap up the construction work.")));

        IDIOM_LIST.add(new Idiom(200, 'z', "Zero In On", "To focus all attention onto a particular target or subject.",
                List.of("The investigative team decided to zero in on the financial records.",
                        "We need to zero in on the core problem to find an effective solution.")));

        IDIOM_LIST.add(new Idiom(201, 'a', "Achilles' Heel", "A small but fatal weakness in spite of overall strength.",
                List.of("His need for approval was his Achilles' heel.",
                        "The company's slow customer service is its Achilles' heel.")));

        IDIOM_LIST.add(new Idiom(202, 'a', "All Greek to Me", "Something that is completely incomprehensible or unintelligible.",
                List.of("The complex legal jargon was all Greek to me.",
                        "When the technician explained the computer problem, it was all Greek to me.")));

        IDIOM_LIST.add(new Idiom(203, 'b', "Back Seat Driver", "A passenger who constantly gives unwanted advice on how to drive.",
                List.of("My mother is such a back seat driver, telling me every turn to make.",
                        "Stop being a back seat driver; I know how to handle this project.")));

        IDIOM_LIST.add(new Idiom(204, 'b', "Bark Worse Than One's Bite", "To be less unpleasant or aggressive than one's words or demeanor suggest.",
                List.of("Don't worry about the CEO; his bark is worse than his bite.",
                        "The drill sergeant seems mean, but his bark is worse than his bite.")));

        IDIOM_LIST.add(new Idiom(205, 'b', "Behind the Times", "Old-fashioned or outdated.",
                List.of("His ideas on marketing are completely behind the times.",
                        "They still use dial-up internet—they are so behind the times.")));

        IDIOM_LIST.add(new Idiom(206, 'b', "Bend Over Backwards", "To make every effort to help someone; to be extremely accommodating.",
                List.of("We bent over backwards to meet the client's impossible deadline.",
                        "The staff will bend over backwards to ensure your stay is comfortable.")));

        IDIOM_LIST.add(new Idiom(207, 'b', "Beside the Point", "Irrelevant; not important to the matter at hand.",
                List.of("Whether you like the color is beside the point; does it function?",
                        "His feelings, while valid, are beside the point in this business decision.")));

        IDIOM_LIST.add(new Idiom(208, 'b', "Between a Rock and a Hard Place", "Faced with a choice between two equally difficult or unpleasant options.",
                List.of("He was between a rock and a hard place: admit the mistake or cover it up.",
                        "We're between a rock and a hard place with the two conflicting deadlines.")));

        IDIOM_LIST.add(new Idiom(209, 'b', "Black Sheep", "A member of a group or family who is regarded as a disgrace to it.",
                List.of("He was always the black sheep of the family for pursuing an artistic career.",
                        "Every organization seems to have a black sheep who causes trouble.")));

        IDIOM_LIST.add(new Idiom(210, 'c', "Call the Shots", "To be in charge; to make the decisions.",
                List.of("As the project lead, she calls the shots on all major decisions.",
                        "I don't call the shots here; you need to speak to the owner.")));

        IDIOM_LIST.add(new Idiom(211, 'c', "Caught Red-Handed", "Discovered in the act of doing something wrong.",
                List.of("The boy was caught red-handed stealing cookies from the jar.",
                        "The cashier was caught red-handed tampering with the register.")));

        IDIOM_LIST.add(new Idiom(212, 'c', "Change of Heart", "A change in one's opinion or attitude.",
                List.of("After meeting the team, he had a change of heart about leaving the company.",
                        "She had a change of heart and decided not to sell the painting.")));

        IDIOM_LIST.add(new Idiom(213, 'c', "Close But No Cigar", "Almost succeeding, but not quite.",
                List.of("He guessed the right answer on the quiz, but misspelled it. Close but no cigar!",
                        "They almost won the contract, but it was close but no cigar.")));

        IDIOM_LIST.add(new Idiom(214, 'd', "Drive a Hard Bargain", "To negotiate fiercely and refuse to make concessions.",
                List.of("He always drives a hard bargain when buying a car.",
                        "If you want a fair deal, you have to be ready to drive a hard bargain.")));

        IDIOM_LIST.add(new Idiom(215, 'd', "Drop the Ball", "To make a mistake, especially by failing to pay attention to a detail or to keep up with an action.",
                List.of("The shipping company dropped the ball and sent the package to the wrong address.",
                        "We can't afford to drop the ball on client security.")));

        IDIOM_LIST.add(new Idiom(216, 'e', "Every Trick in the Book", "To try every possible method or strategy.",
                List.of("He used every trick in the book to try and win the game.",
                        "They tried every trick in the book to get the machine working again.")));

        IDIOM_LIST.add(new Idiom(217, 'f', "Fifth Wheel", "An unwelcome or superfluous person in a group, often a couple.",
                List.of("I felt like a fifth wheel walking with the married couple.",
                        "She hates going to parties alone and being the fifth wheel.")));

        IDIOM_LIST.add(new Idiom(218, 'f', "Fish Out of Water", "Feeling uncomfortable or awkward in an unfamiliar environment.",
                List.of("As a city person in the remote village, I felt like a fish out of water.",
                        "He was a physicist at the art convention, completely a fish out of water.")));

        IDIOM_LIST.add(new Idiom(219, 'f', "Fork in the Road", "A point at which a difficult choice has to be made.",
                List.of("After graduation, she reached a fork in the road regarding her career path.",
                        "The business is at a fork in the road: expand or stay small.")));

        IDIOM_LIST.add(new Idiom(220, 'f', "Full of Hot Air", "Talking foolishly or boastfully; unreliable in what one says.",
                List.of("Don't listen to his promises; he's full of hot air.",
                        "That politician is full of hot air and never follows through.")));

        IDIOM_LIST.add(new Idiom(221, 'g', "Go The Extra Mile", "To make an extra effort; to do more than what is strictly required.",
                List.of("The customer service agent went the extra mile to resolve my issue.",
                        "If you want to excel, you must go the extra mile.")));

        IDIOM_LIST.add(new Idiom(222, 'g', "Grind to a Halt", "To slow down, stop, or cease to function.",
                List.of("The factory's production ground to a halt after the power outage.",
                        "Negotiations ground to a halt when neither side would compromise.")));

        IDIOM_LIST.add(new Idiom(223, 'h', "Have the Upper Hand", "To have an advantage or be in a position of control.",
                List.of("The home team had the upper hand for most of the game.",
                        "In the negotiation, the buyer had the upper hand because the seller was desperate.")));

        IDIOM_LIST.add(new Idiom(224, 'h', "Hear on the Grapevine", "To hear news or information through rumor or gossip.",
                List.of("I heard through the grapevine that the office is moving next month.",
                        "Did you hear about the merger? I heard it on the grapevine.")));

        IDIOM_LIST.add(new Idiom(225, 'h', "Hit the Books", "To study hard, usually for a test or exam.",
                List.of("I have a big final tomorrow, so I need to hit the books tonight.",
                        "If you want to pass the bar exam, you'll need to hit the books every day.")));

        IDIOM_LIST.add(new Idiom(226, 'i', "In the Loop", "Part of a group that is kept informed about something.",
                List.of("Make sure you keep me in the loop regarding any budget changes.",
                        "The manager ensures that all team members are in the loop on project updates.")));

        IDIOM_LIST.add(new Idiom(227, 'j', "Jump the Shark", "A point at which a series, show, or campaign has passed its peak and begun a decline in quality or popularity.",
                List.of("Fans agree that the show officially jumped the shark after the main character left.",
                        "The brand's advertising jumped the shark with that ridiculous commercial.")));

        IDIOM_LIST.add(new Idiom(228, 'k', "Keep a Low Profile", "To avoid drawing attention to oneself.",
                List.of("The celebrity decided to keep a low profile after the scandal.",
                        "Until the investigation is over, you should keep a low profile.")));

        IDIOM_LIST.add(new Idiom(229, 'k', "Knock Your Socks Off", "To impress or excite someone greatly.",
                List.of("Wait until you try this new recipe; it's going to knock your socks off.",
                        "The concert was amazing; the performance knocked my socks off.")));

        IDIOM_LIST.add(new Idiom(230, 'l', "Lose Your Marbles", "To go crazy; to become mentally unstable.",
                List.of("He’s been working non-stop for weeks—I think he's losing his marbles.",
                        "Did you seriously wear two different shoes? Have you lost your marbles?")));

        IDIOM_LIST.add(new Idiom(231, 'm', "Muddy the Waters", "To make a situation or issue unclear or confusing.",
                List.of("The contradictory reports only served to muddy the waters on the investigation.",
                        "His vague explanation just muddied the waters for the students.")));

        IDIOM_LIST.add(new Idiom(232, 'n', "Neck and Neck", "Tied in a race or competition.",
                List.of("The two leading candidates are neck and neck in the polls.",
                        "The marathon runners were neck and neck right up to the finish line.")));

        IDIOM_LIST.add(new Idiom(233, 'n', "Not a Spark of Decency", "Having no morality or kindness whatsoever.",
                List.of("That landlord raised the rent on the struggling family; he doesn't have a spark of decency.",
                        "To cheat a friend out of money shows not a spark of decency.")));

        IDIOM_LIST.add(new Idiom(234, 'o', "Off the Cuff", "Spoken or done without preparation; extemporaneously.",
                List.of("His speech was completely off the cuff, yet very engaging.",
                        "That remark was off the cuff; I didn't mean to offend anyone.")));

        IDIOM_LIST.add(new Idiom(235, 'o', "On the Wagon", "Abstaining from drinking alcohol.",
                List.of("He hasn't had a drink in a year; he's been on the wagon.",
                        "I can't join you for a glass of wine; I'm on the wagon for a month.")));

        IDIOM_LIST.add(new Idiom(236, 'p', "Par for the Course", "What is expected or normal for a particular situation or activity.",
                List.of("Long lines at the DMV are just par for the course.",
                        "The technical glitches were par for the course with that old software.")));

        IDIOM_LIST.add(new Idiom(237, 'p', "Pass with Flying Colors", "To pass a test or perform well easily and successfully.",
                List.of("She passed her driving test with flying colors on the first attempt.",
                        "The product review came back with flying colors.")));

        IDIOM_LIST.add(new Idiom(238, 'q', "Quick Fix", "A temporary and easy solution that avoids addressing the underlying problem.",
                List.of("We need a permanent solution, not a quick fix.",
                        "Taping the leak is just a quick fix; we need a new pipe.")));

        IDIOM_LIST.add(new Idiom(239, 'r', "Read the Riot Act", "To issue a stern warning with clear consequences for misbehavior.",
                List.of("The coach read the riot act to the team after their dismal performance.",
                        "My mother read me the riot act after I broke curfew.")));

        IDIOM_LIST.add(new Idiom(240, 'r', "Reinvent the Wheel", "To waste time and effort creating something that already exists or has been done successfully.",
                List.of("Don't reinvent the wheel; just use the existing template for the report.",
                        "We have a process that works; there's no need to reinvent the wheel.")));

        IDIOM_LIST.add(new Idiom(241, 's', "Save Your Breath", "To advise someone that their efforts to convince or argue are futile.",
                List.of("Save your breath; I've already made up my mind.",
                        "He won't change his opinion, so save your breath.")));

        IDIOM_LIST.add(new Idiom(242, 's', "See the Light", "To finally understand or realize the truth about something.",
                List.of("After many arguments, she finally saw the light and accepted the proposal.",
                        "Once I tried the new system, I saw the light and realized how much time I was wasting.")));

        IDIOM_LIST.add(new Idiom(243, 's', "Shape Up or Ship Out", "To improve one's behavior or work performance immediately, or face losing the job/position.",
                List.of("The boss told the underperforming employee to shape up or ship out.",
                        "It's time for the whole team to shape up or ship out.")));

        IDIOM_LIST.add(new Idiom(244, 't', "Take the Cake", "To be the most remarkable, usually in a negative or absurd way.",
                List.of("Of all the excuses, his story about the alien abduction really takes the cake.",
                        "The manager's bizarre request really takes the cake.")));

        IDIOM_LIST.add(new Idiom(245, 't', "The Midas Touch", "The ability to make money easily in any business venture.",
                List.of("Everything he invests in succeeds; he seems to have the Midas touch.",
                        "The new director has the Midas touch, turning failing divisions into successes.")));

        IDIOM_LIST.add(new Idiom(246, 't', "Throwing Good Money After Bad", "Spending more money on something that is clearly failing or not working.",
                List.of("Continuing to repair that old car is just throwing good money after bad.",
                        "They realized they were throwing good money after bad by keeping the outdated equipment.")));

        IDIOM_LIST.add(new Idiom(247, 't', "To Get Under Someone's Skin", "To irritate or annoy someone intensely.",
                List.of("His constant humming really gets under my skin.",
                        "I try to ignore his rude comments, but they still get under my skin.")));

        IDIOM_LIST.add(new Idiom(248, 'u', "Under Your Belt", "Achieved or acquired, often referring to experience or qualifications.",
                List.of("With a few years of experience under your belt, you can apply for a senior role.",
                        "She has three degrees under her belt, making her highly qualified.")));

        IDIOM_LIST.add(new Idiom(249, 'w', "Wet Behind the Ears", "Inexperienced, naive, or new to a job.",
                List.of("He's too wet behind the ears to handle this complex negotiation.",
                        "You can't trust the judgment of someone still wet behind the ears.")));

        IDIOM_LIST.add(new Idiom(250, 'y', "You Can Say That Again", "A phrase used to express strong agreement with something someone has just said.",
                List.of("A: This weather is absolutely miserable. B: You can say that again!",
                        "A: That was the best concert ever. B: You can say that again!")));
        IDIOM_LIST.add(new Idiom(251, 'a', "An Axe to Grind", "Having a selfish reason or hidden personal agenda for doing or saying something.",
                List.of("He seems helpful, but I suspect he has an axe to grind with the department head.",
                        "The journalist’s critique felt harsh, as if he had an axe to grind.")));

        IDIOM_LIST.add(new Idiom(252, 'b', "Bail Out", "To escape a difficult situation, or to provide financial assistance to help someone escape it.",
                List.of("When the company started losing money, the CEO bailed out.",
                        "The government had to bail out the failing banks.")));

        IDIOM_LIST.add(new Idiom(253, 'b', "Ballpark Figure", "A rough estimate or approximate number.",
                List.of("Can you give me a ballpark figure for the cost of the renovation?",
                        "That number is just a ballpark figure; the final price will vary.")));

        IDIOM_LIST.add(new Idiom(254, 'b', "Behind Closed Doors", "Done secretly or privately, without public knowledge.",
                List.of("The board made the controversial decision behind closed doors.",
                        "We don't know the real reasons, as the negotiations happened behind closed doors.")));

        IDIOM_LIST.add(new Idiom(255, 'b', "Blowing Smoke", "Exaggerating or boasting; saying things that are not true to impress someone.",
                List.of("He keeps talking about his past successes, but I think he's just blowing smoke.",
                        "Don't worry about his threats; he’s just blowing smoke.")));

        IDIOM_LIST.add(new Idiom(256, 'b', "Bottom Line", "The most important fact or consideration; the final result.",
                List.of("The bottom line is that we need to increase sales by 15%.",
                        "I don't care about the details; tell me the bottom line.")));

        IDIOM_LIST.add(new Idiom(257, 'c', "Call It Even", "To consider a debt or dispute settled or balanced.",
                List.of("You paid for lunch, I'll pay for dinner; let's call it even.",
                        "After he fixed my car, I helped him move, so we called it even.")));

        IDIOM_LIST.add(new Idiom(258, 'c', "Can't Make Heads or Tails of Something", "To be unable to understand something at all.",
                List.of("I can't make heads or tails of these complex instructions.",
                        "The new software interface is so confusing, I can't make heads or tails of it.")));

        IDIOM_LIST.add(new Idiom(259, 'c', "Catch 22", "A difficult situation for which the only solution is denied by a circumstance inherent in the problem.",
                List.of("I need experience to get a job, but I need a job to get experience—it's a Catch 22.",
                        "The policy creates a Catch 22 where compliance is impossible.")));

        IDIOM_LIST.add(new Idiom(260, 'c', "Change Gears", "To suddenly change one's plans, methods, or subject of conversation.",
                List.of("The manager suddenly changed gears and started discussing the holiday party.",
                        "We need to change gears and focus on the emergency situation.")));

        IDIOM_LIST.add(new Idiom(261, 'c', "Cloud Nine", "A state of extreme happiness.",
                List.of("Ever since she got her acceptance letter, she's been on cloud nine.",
                        "He was on cloud nine after the birth of his first child.")));

        IDIOM_LIST.add(new Idiom(262, 'd', "Daylight Robbery", "A price that is exorbitant or outrageously expensive.",
                List.of("The cost of a small bottle of water at the airport is daylight robbery.",
                        "Charging that much for a simple repair is daylight robbery.")));

        IDIOM_LIST.add(new Idiom(263, 'd', "Down in the Dumps", "Feeling sad, unhappy, or depressed.",
                List.of("She's been down in the dumps ever since her cat ran away.",
                        "I felt down in the dumps after failing the audition.")));

        IDIOM_LIST.add(new Idiom(264, 'd', "Dressed to the Nines", "Wearing fashionable or formal clothes; dressed elegantly.",
                List.of("They were all dressed to the nines for the awards ceremony.",
                        "You look great—dressed to the nines for your interview!")));

        IDIOM_LIST.add(new Idiom(265, 'e', "Ears Are Burning", "The sensation that one is being talked about elsewhere.",
                List.of("I feel like my ears are burning; someone must be talking about me.",
                        "We just mentioned his name, and he walked in! Were your ears burning?")));

        IDIOM_LIST.add(new Idiom(266, 'f', "Fall Apart at the Seams", "To fail completely; to become ineffective due to internal difficulties.",
                List.of("The organization started to fall apart at the seams after the leadership resigned.",
                        "The old chair is falling apart at the seams.")));

        IDIOM_LIST.add(new Idiom(267, 'f', "Flesh and Blood", "One's own family or close relatives.",
                List.of("He had to help her; she is his own flesh and blood.",
                        "It's hard to turn away from your own flesh and blood.")));

        IDIOM_LIST.add(new Idiom(268, 'g', "Get the Ball Rolling", "To start an activity or process.",
                List.of("Let's get the ball rolling on this new project right away.",
                        "We need to call a meeting to get the ball rolling on the renovation.")));

        IDIOM_LIST.add(new Idiom(269, 'g', "Get the Cold Shoulder", "To be deliberately ignored or treated in an unfriendly way.",
                List.of("After the disagreement, I got the cold shoulder from my colleague.",
                        "She expected a warm welcome but only got the cold shoulder.")));

        IDIOM_LIST.add(new Idiom(270, 'g', "Give Someone a Taste of Their Own Medicine", "To treat someone with the same negative behavior they have shown to others.",
                List.of("He's always rude, so it was good that he finally got a taste of his own medicine.",
                        "The prankster got a taste of his own medicine when his friends played a trick on him.")));

        IDIOM_LIST.add(new Idiom(271, 'h', "Hard and Fast", "Strictly established or enforced; not easily changed.",
                List.of("There are no hard and fast rules about how to write a good essay.",
                        "We need a hard and fast deadline for the submission.")));

        IDIOM_LIST.add(new Idiom(272, 'h', "Have a Chip on One's Shoulder", "To hold a grudge or have an aggressive attitude because of a past slight or perceived inferiority.",
                List.of("He walks around with a chip on his shoulder ever since he was fired.",
                        "She has a chip on her shoulder about not getting into her first-choice university.")));

        IDIOM_LIST.add(new Idiom(273, 'h', "Hit the Sack", "To go to bed.",
                List.of("I'm exhausted; I'm going to hit the sack.",
                        "It's 11 PM, time to hit the sack.")));

        IDIOM_LIST.add(new Idiom(274, 'i', "In Full Swing", "At the height of activity; operating at its maximum level.",
                List.of("The carnival was in full swing by late afternoon.",
                        "The construction work is now in full swing, with workers everywhere.")));

        IDIOM_LIST.add(new Idiom(275, 'j', "Jury Is Still Out", "A decision has not yet been made; the matter is still uncertain.",
                List.of("The jury is still out on whether the new product will be a success.",
                        "They've made promises, but the jury is still out on their commitment.")));

        IDIOM_LIST.add(new Idiom(276, 'k', "Keep Your Head Above Water", "To manage to survive financially despite difficulties.",
                List.of("Since the layoff, he is just barely keeping his head above water.",
                        "The company is struggling to keep its head above water during the recession.")));

        IDIOM_LIST.add(new Idiom(277, 'k', "Kick the Bucket", "To die (informal and somewhat crude).",
                List.of("The old car finally kicked the bucket on the highway.",
                        "My grandpa lived a long life before he finally kicked the bucket.")));

        IDIOM_LIST.add(new Idiom(278, 'l', "Last Resort", "A final option when all others have failed.",
                List.of("Calling the emergency number was their last resort.",
                        "We'll use the reserve funds as a last resort.")));

        IDIOM_LIST.add(new Idiom(279, 'l', "Lend a Hand", "To help someone with a task.",
                List.of("Could you lend a hand moving this heavy box?",
                        "I always try to lend a hand to my neighbors when they need it.")));

        IDIOM_LIST.add(new Idiom(280, 'l', "Let Off the Hook", "To allow someone to escape punishment or responsibility.",
                List.of("The judge let the first-time offender off the hook with a warning.",
                        "I let my brother off the hook for washing the dishes tonight.")));

        IDIOM_LIST.add(new Idiom(281, 'l', "Like a Broken Record", "Constantly repeating the same thing.",
                List.of("He keeps complaining about the food like a broken record.",
                        "Stop talking about your injury; you sound like a broken record.")));

        IDIOM_LIST.add(new Idiom(282, 'm', "Move Heaven and Earth", "To do everything possible to achieve a goal.",
                List.of("She promised to move heaven and earth to get the project finished on time.",
                        "He would move heaven and earth for his family.")));

        IDIOM_LIST.add(new Idiom(283, 'n', "No-Brainer", "A decision or choice that is so obvious that it requires little or no thought.",
                List.of("Accepting that job offer was a complete no-brainer.",
                        "Buying the discounted tickets was a no-brainer.")));

        IDIOM_LIST.add(new Idiom(284, 'n', "Not Hold Water", "Of an argument or explanation, to seem illogical, untrue, or indefensible.",
                List.of("His alibi does not hold water, as witnesses saw him at the scene.",
                        "The lawyer's arguments simply did not hold water with the jury.")));

        IDIOM_LIST.add(new Idiom(285, 'o', "Off the Record", "Not intended to be made public or quoted officially.",
                List.of("The mayor made a few comments off the record after the press conference.",
                        "What I'm telling you is off the record, so don't tell anyone.")));

        IDIOM_LIST.add(new Idiom(286, 'o', "On a Roll", "Experiencing a prolonged period of success or good luck.",
                List.of("The team is on a roll, winning five games in a row.",
                        "She's been on a roll with her investments lately.")));

        IDIOM_LIST.add(new Idiom(287, 'o', "Open a Can of Worms", "To create a complex situation or unleash a number of unpredictable problems.",
                List.of("The audit will open a huge can of worms about how the funds were spent.",
                        "Be careful discussing politics, you don't want to open a can of worms at the dinner table.")));

        IDIOM_LIST.add(new Idiom(288, 'p', "Pass the Torch", "To hand down a responsibility or knowledge to the next generation or successor.",
                List.of("The CEO decided it was time to pass the torch to his younger vice president.",
                        "The retiring teacher passed the torch of the debate club to a new mentor.")));

        IDIOM_LIST.add(new Idiom(289, 'p', "Play by the Ear", "To improvise and decide on a course of action as one goes along.",
                List.of("We don't have a strict schedule; we'll just play it by the ear.",
                        "We didn't plan the exact details of the trip; we decided to play it by the ear.")));

        IDIOM_LIST.add(new Idiom(290, 'p', "Put the Cart Before the Horse", "To do things in the wrong order.",
                List.of("You are putting the cart before the horse by buying furniture before finding an apartment.",
                        "Trying to celebrate before winning is putting the cart before the horse.")));

        IDIOM_LIST.add(new Idiom(291, 'r', "Read the Writing on the Wall", "To recognize and understand a clear indication of how a situation is likely to develop.",
                List.of("When the budget was cut, she read the writing on the wall and started looking for a new job.",
                        "The sales figures show the writing on the wall: the product is failing.")));

        IDIOM_LIST.add(new Idiom(292, 'r', "Red Tape", "Excessive official rules and procedures that create delays and difficulty.",
                List.of("We spent weeks cutting through the red tape just to get the permit.",
                        "The company is notorious for its bureaucratic red tape.")));

        IDIOM_LIST.add(new Idiom(293, 's', "Sell Like Hotcakes", "To be sold quickly and in large quantities.",
                List.of("The new phones are selling like hotcakes worldwide.",
                        "Tickets to the final show sold like hotcakes within minutes.")));

        IDIOM_LIST.add(new Idiom(294, 's', "Stand One's Ground", "To maintain one's position or opinion despite opposition or pressure.",
                List.of("The witness stood his ground under heavy cross-examination.",
                        "It’s important to stand your ground when you know you are right.")));

        IDIOM_LIST.add(new Idiom(295, 's', "Stir Up a Hornet's Nest", "To deliberately cause trouble or provoke a violent reaction.",
                List.of("Bringing up that old scandal will only stir up a hornet's nest.",
                        "His controversial comments stirred up a hornet's nest on social media.")));

        IDIOM_LIST.add(new Idiom(296, 't', "Take a Back Seat", "To accept a less important position or role.",
                List.of("After his promotion, he decided to take a back seat in the daily operations.",
                        "I was happy to take a back seat and let the others lead the meeting.")));

        IDIOM_LIST.add(new Idiom(297, 't', "Talk is Cheap", "It is easier to talk about doing something than to actually do it.",
                List.of("He promised to help, but talk is cheap; I need action.",
                        "The opposition makes a lot of claims, but talk is cheap.")));

        IDIOM_LIST.add(new Idiom(298, 't', "The Coast Is Clear", "There is no danger or chance of being caught; no one is watching.",
                List.of("She waited until the coast was clear before sneaking into the kitchen.",
                        "Go ahead and leave; the coast is clear.")));

        IDIOM_LIST.add(new Idiom(299, 't', "Turn Over a New Leaf", "To change one's behavior or life for the better.",
                List.of("After his mistake, he promised to turn over a new leaf and be more responsible.",
                        "The New Year is a great time to turn over a new leaf.")));

        IDIOM_LIST.add(new Idiom(300, 'w', "Without a Hitch", "Without any problems or difficulties.",
                List.of("The event planning went off without a hitch.",
                        "The surgery was performed without a hitch, and the patient recovered quickly.")));
        IDIOM_LIST.add(new Idiom(301, 'a', "Across the Board", "Applying to or involving everyone or everything.",
                List.of("The pay raise was implemented across the board for all employees.",
                        "The new rule applies across the board, without exception.")));

        IDIOM_LIST.add(new Idiom(302, 'a', "All Bent Out of Shape", "Becoming upset or angry.",
                List.of("Don't get all bent out of shape over a minor mistake.",
                        "He was bent out of shape because his flight was delayed.")));

        IDIOM_LIST.add(new Idiom(303, 'a', "As the Crow Flies", "The shortest, most direct route (usually referring to distance).",
                List.of("It's about 10 miles to the city as the crow flies, but 15 by road.",
                        "We measured the distance as the crow flies.")));

        IDIOM_LIST.add(new Idiom(304, 'b', "Bake a Cake", "To prepare a cake (Used here as a simple example to continue a sequence).",
                List.of("She spent the afternoon baking a cake for the party.",
                        "My favorite thing to do on a rainy day is to bake a cake.")));

        IDIOM_LIST.add(new Idiom(305, 'b', "Baptism by Fire", "A difficult or stressful introduction to a new activity or job.",
                List.of("His first day as CEO was a total disaster; it was a baptism by fire.",
                        "The new nurse’s first week in the emergency room was a baptism by fire.")));

        IDIOM_LIST.add(new Idiom(306, 'b', "Bide One's Time", "To wait patiently for a good opportunity to arise.",
                List.of("He is biding his time until the housing market improves.",
                        "We need to bide our time and launch the product when demand is highest.")));

        IDIOM_LIST.add(new Idiom(307, 'b', "Big Shot", "An important or influential person.",
                List.of("He acts like a big shot since he got promoted.",
                        "The gala was attended by many big shots in the industry.")));

        IDIOM_LIST.add(new Idiom(308, 'b', "Black and White", "Clear and definitive; without shades of gray.",
                List.of("The contract must be in black and white before I sign it.",
                        "The issue isn't always black and white; there are complexities.")));

        IDIOM_LIST.add(new Idiom(309, 'b', "Bolt from the Blue", "A sudden, unexpected event.",
                List.of("The news of his resignation came like a bolt from the blue.",
                        "The unexpected inheritance was a bolt from the blue.")));

        IDIOM_LIST.add(new Idiom(310, 'c', "Clear as a Bell", "Very clear and easy to understand.",
                List.of("The instructions were clear as a bell; no one could misunderstand them.",
                        "Her singing voice was clear as a bell.")));

        IDIOM_LIST.add(new Idiom(311, 'c', "Come Hell or High Water", "No matter what happens; despite any difficulty.",
                List.of("I will finish this project by the deadline, come hell or high water.",
                        "Come hell or high water, we will be at your wedding.")));

        IDIOM_LIST.add(new Idiom(312, 'c', "Cream of the Crop", "The best of a group; the highest quality.",
                List.of("Only the cream of the crop were invited to the exclusive training program.",
                        "This university accepts only the cream of the crop of high school students.")));

        IDIOM_LIST.add(new Idiom(313, 'd', "Dark Horse", "A person or thing that was previously little known but unexpectedly wins or succeeds.",
                List.of("The relatively unknown politician was the dark horse of the election.",
                        "The quiet student turned out to be the dark horse in the chess tournament.")));

        IDIOM_LIST.add(new Idiom(314, 'd', "Die-Hard", "Very devoted and loyal to a particular team, group, or cause.",
                List.of("He is a die-hard fan of the local football club.",
                        "They are die-hard believers in their controversial theory.")));

        IDIOM_LIST.add(new Idiom(315, 'd', "Dog-Eat-Dog", "A fiercely competitive situation where people will do anything to succeed.",
                List.of("The job market right now is dog-eat-dog.",
                        "It's a dog-eat-dog world in high-stakes finance.")));

        IDIOM_LIST.add(new Idiom(316, 'd', "Donkey's Years", "A very long time.",
                List.of("I haven't seen you in donkey's years!",
                        "It took donkey's years to get the approval needed for the project.")));

        IDIOM_LIST.add(new Idiom(317, 'e', "Eat Crow", "To be forced to acknowledge that one was wrong or defeated; to admit a humiliating mistake.",
                List.of("After loudly predicting failure, he had to eat crow when the product succeeded.",
                        "The expert had to eat crow when his forecast proved incorrect.")));

        IDIOM_LIST.add(new Idiom(318, 'f', "Fair and Square", "Honestly and without cheating.",
                List.of("The team won the championship fair and square.",
                        "She earned the promotion fair and square.")));

        IDIOM_LIST.add(new Idiom(319, 'f', "Fine Kettle of Fish", "A mess; a difficult or awkward situation.",
                List.of("We missed the flight and lost our luggage—that's a fine kettle of fish!",
                        "They lost the keys right before leaving. That's a fine kettle of fish.")));

        IDIOM_LIST.add(new Idiom(320, 'f', "Flash in the Pan", "Something that has an initial success but then fails to deliver anything lasting.",
                List.of("Everyone thought the product would be huge, but it turned out to be just a flash in the pan.",
                        "His overnight fame was just a flash in the pan.")));

        IDIOM_LIST.add(new Idiom(321, 'g', "Get Away with Murder", "To avoid punishment for doing something wrong or illegal.",
                List.of("The rich heiress seems to get away with murder because of her connections.",
                        "That teacher lets the students get away with murder.")));

        IDIOM_LIST.add(new Idiom(322, 'g', "Get the Wrong End of the Stick", "To completely misunderstand a situation or a statement.",
                List.of("I think you've got the wrong end of the stick; I didn't mean that at all.",
                        "The media got the wrong end of the stick regarding the policy change.")));

        IDIOM_LIST.add(new Idiom(323, 'h', "Have One's Cake and Eat It Too", "To want or try to have two desirable things that are impossible to have simultaneously.",
                List.of("She wants a promotion without taking on extra work; she wants to have her cake and eat it too.",
                        "You can't have your cake and eat it too in this investment.")));

        IDIOM_LIST.add(new Idiom(324, 'h', "Hush-Hush", "Secret or confidential.",
                List.of("The details of the merger are all very hush-hush right now.",
                        "They kept the new product development hush-hush until the launch.")));

        IDIOM_LIST.add(new Idiom(325, 'i', "In the Red", "Losing money; operating at a loss (referring to the color of negative numbers in accounting).",
                List.of("The company has been operating in the red for three quarters.",
                        "We need to cut costs to get out of the red.")));

        IDIOM_LIST.add(new Idiom(326, 'i', "Iron Out", "To resolve difficulties or disagreements.",
                List.of("The lawyers are meeting tomorrow to iron out the final details of the contract.",
                        "We need to iron out the schedule before the conference begins.")));

        IDIOM_LIST.add(new Idiom(327, 'k', "Keep Tabs On", "To monitor or keep track of someone or something.",
                List.of("The government keeps tabs on known criminals.",
                        "I keep tabs on the competitor's prices.")));

        IDIOM_LIST.add(new Idiom(328, 'k', "Knock On Wood", "Used to express hope that a good thing will continue or that a bad thing will not happen (often accompanied by actually tapping wood).",
                List.of("My car hasn't broken down all year, knock on wood.",
                        "The business has been successful so far, knock on wood.")));

        IDIOM_LIST.add(new Idiom(329, 'l', "Leaps and Bounds", "By a very large degree; rapidly.",
                List.of("The new student's English skills are improving by leaps and bounds.",
                        "Our sales have grown by leaps and bounds since the new campaign.")));

        IDIOM_LIST.add(new Idiom(330, 'l', "Let Bygones Be Bygones", "To forget about past differences or quarrels.",
                List.of("We should stop arguing and just let bygones be bygones.",
                        "It's time to let bygones be bygones and focus on the future.")));

        IDIOM_LIST.add(new Idiom(331, 'l', "Light at the End of the Tunnel", "A sign that a difficult period is almost over.",
                List.of("After months of hard work, we can finally see the light at the end of the tunnel.",
                        "The vaccine offers a light at the end of the tunnel for the pandemic.")));

        IDIOM_LIST.add(new Idiom(332, 'm', "Mad as a Wet Hen", "Extremely angry or annoyed.",
                List.of("She was mad as a wet hen when she found out they had canceled her reservation.",
                        "Don't tell him the bad news; he's already mad as a wet hen.")));

        IDIOM_LIST.add(new Idiom(333, 'm', "Make a Mountain Out of a Molehill", "To exaggerate a minor problem, making it seem much more serious than it is.",
                List.of("It was just a small scratch; don't make a mountain out of a molehill.",
                        "He tends to make a mountain out of a molehill over trivial matters.")));

        IDIOM_LIST.add(new Idiom(334, 'n', "New Lease on Life", "A renewed energy or interest in life; a fresh start.",
                List.of("After his recovery, he felt he had a new lease on life.",
                        "The renovation gave the old building a new lease on life.")));

        IDIOM_LIST.add(new Idiom(335, 'o', "On the Dot", "Exactly on time; precisely.",
                List.of("The meeting started at 9:00 AM on the dot.",
                        "Please arrive at the station at 7:30 on the dot.")));

        IDIOM_LIST.add(new Idiom(336, 'o', "Once and For All", "Finally and definitively.",
                List.of("It's time to settle this argument once and for all.",
                        "She decided to clean her garage once and for all.")));

        IDIOM_LIST.add(new Idiom(337, 'o', "Open Book", "Someone or something that is easy to understand and keeps no secrets.",
                List.of("He's an open book; you never have to guess what he's thinking.",
                        "The family's history became an open book after the biography was published.")));

        IDIOM_LIST.add(new Idiom(338, 'p', "Pardon My French", "An apology for using offensive or vulgar language.",
                List.of("That presentation was, pardon my French, a total disaster.",
                        "Pardon my French, but that's a ridiculous idea.")));

        IDIOM_LIST.add(new Idiom(339, 'p', "Penny-Pinching", "Being very careful with money; frugal or stingy.",
                List.of("The company's penny-pinching habits often lead to low-quality products.",
                        "He is a penny-pinching millionaire who hates spending money.")));

        IDIOM_LIST.add(new Idiom(340, 'p', "Picture Paints a Thousand Words", "A visual image conveys a concept or idea more effectively than a description does.",
                List.of("Instead of writing a long explanation, just send them the chart; a picture paints a thousand words.",
                        "The architect realized a picture paints a thousand words when showing the design.")));

        IDIOM_LIST.add(new Idiom(341, 'p', "Play Second Fiddle", "To take a subordinate or less important role than someone else.",
                List.of("She got tired of always playing second fiddle to the department head.",
                        "He was content to play second fiddle to the star musician.")));

        IDIOM_LIST.add(new Idiom(342, 'q', "Quick and Dirty", "Done or achieved quickly, usually with low quality or without careful attention to detail.",
                List.of("I just need a quick and dirty estimate for the project's cost.",
                        "It was a quick and dirty solution, but it fixed the immediate problem.")));

        IDIOM_LIST.add(new Idiom(343, 'r', "Recharge One's Batteries", "To rest and regain energy.",
                List.of("I'm taking a week off work to recharge my batteries.",
                        "A short nap is all I need to recharge my batteries.")));

        IDIOM_LIST.add(new Idiom(344, 'r', "Red-Letter Day", "A day that is memorable because of some important or happy event.",
                List.of("The day the contract was signed was a red-letter day for the startup.",
                        "My graduation was a real red-letter day for the whole family.")));

        IDIOM_LIST.add(new Idiom(345, 's', "Safe and Sound", "Uninjured, unharmed, or secure.",
                List.of("Despite the storm, the ship made it back to port safe and sound.",
                        "The lost hiker was found safe and sound after three days.")));

        IDIOM_LIST.add(new Idiom(346, 's', "Shake a Leg", "To hurry up; to move faster.",
                List.of("We’re going to be late! Shake a leg!",
                        "Come on, shake a leg, or we'll miss the bus.")));

        IDIOM_LIST.add(new Idiom(347, 's', "Shine On", "To continue or persevere despite difficulty (often used dismissively or sarcastically in some contexts).",
                List.of("They are struggling, but they intend to shine on and succeed.",
                        "Just ignore the criticism and shine on.")));

        IDIOM_LIST.add(new Idiom(348, 's', "Show Your True Colors", "To reveal one's real nature or character, especially after having concealed it.",
                List.of("When the pressure mounted, he showed his true colors and became very rude.",
                        "The crisis made the politician show his true colors to the public.")));

        IDIOM_LIST.add(new Idiom(349, 't', "Take the Edge Off", "To slightly moderate or lessen the intensity of something, often pain, craving, or tension.",
                List.of("A warm bath helped take the edge off her stress.",
                        "He took a small drink to take the edge off his anxiety before the presentation.")));

        IDIOM_LIST.add(new Idiom(350, 't', "The Gift of Gab", "The ability to speak easily and persuasively.",
                List.of("As a salesman, he definitely has the gift of gab.",
                        "The politician relied on the gift of gab to win over voters.")));
        IDIOM_LIST.add(new Idiom(351, 't', "The Last Hurdle", "The final difficulty or obstacle in a process.",
                List.of("The presentation is finished; all we have left is the last hurdle of client approval.",
                        "Getting the final signature was the last hurdle for the project.")));

        IDIOM_LIST.add(new Idiom(352, 't', "Throw in the Towel", "To give up; to admit defeat.",
                List.of("After hours of trying to fix the car, I finally threw in the towel and called a mechanic.",
                        "The boxer was ready to throw in the towel after the tenth round.")));

        IDIOM_LIST.add(new Idiom(353, 't', "Tighten Your Belt", "To reduce spending; to live more frugally.",
                List.of("With the economy slowing, everyone has to tighten their belt.",
                        "We need to tighten our belt until the next paycheck arrives.")));

        IDIOM_LIST.add(new Idiom(354, 'u', "Under the Weather", "Feeling slightly unwell or sick.",
                List.of("I'm feeling a bit under the weather today, so I'll stay home.",
                        "She's been under the weather all week with a nasty cold.")));

        IDIOM_LIST.add(new Idiom(355, 'w', "Walk a Tightrope", "To be in a precarious or dangerous situation that requires careful balancing or planning.",
                List.of("The government is walking a tightrope between inflation and recession.",
                        "He is walking a tightrope between pleasing his boss and his team.")));

        IDIOM_LIST.add(new Idiom(356, 'w', "Warts and All", "Including all faults or imperfections.",
                List.of("He described the company's history, warts and all, during the interview.",
                        "I love my hometown, warts and all.")));

        IDIOM_LIST.add(new Idiom(357, 'w', "Wear Out One's Welcome", "To stay so long that one is no longer welcome.",
                List.of("It was time to leave; I didn't want to wear out my welcome.",
                        "The neighbors visit so often that they are wearing out their welcome.")));

        IDIOM_LIST.add(new Idiom(358, 'w', "When in Rome, Do as the Romans Do", "When you are in a foreign place or new situation, you should follow the customs of the people there.",
                List.of("I don't usually eat such late dinners, but when in Rome, do as the Romans do.",
                        "The host convinced her to try the local dish, saying, 'When in Rome...'")));

        IDIOM_LIST.add(new Idiom(359, 'w', "White Elephant", "A possession that is useless, troublesome, or expensive to maintain.",
                List.of("The huge old factory became a white elephant for the city.",
                        "That expensive piece of gym equipment is a white elephant; no one ever uses it.")));

        IDIOM_LIST.add(new Idiom(360, 'y', "You Can't Judge a Book by Its Cover", "You shouldn't judge the value or quality of something by its outward appearance.",
                List.of("The restaurant looks simple, but the food is amazing—you can't judge a book by its cover.",
                        "Don't dismiss him based on his casual clothes; you can't judge a book by its cover.")));

        IDIOM_LIST.add(new Idiom(361, 'z', "Zip Your Lip", "To stop talking; to keep quiet or a secret.",
                List.of("I have told you the secret, now zip your lip and don't tell anyone.",
                        "The spy was instructed to zip his lip and reveal nothing.")));

        IDIOM_LIST.add(new Idiom(362, 'a', "A Piece of the Action", "A share in the profits or benefits of an activity.",
                List.of("The investor demanded a piece of the action in the successful startup.",
                        "After helping with the planning, she wanted a piece of the action.")));

        IDIOM_LIST.add(new Idiom(363, 'b', "Brave New World", "A phrase used, often ironically, to refer to a new and drastically changed era.",
                List.of("After the merger, the company entered a brave new world of global competition.",
                        "The shift to remote work introduced a brave new world for employees.")));

        IDIOM_LIST.add(new Idiom(364, 'b', "By Hook or by Crook", "By any possible means, fair or unfair.",
                List.of("He was determined to win the election by hook or by crook.",
                        "They achieved their goal by hook or by crook.")));

        IDIOM_LIST.add(new Idiom(365, 'c', "Caught Between Two Stools", "Caught between two alternatives, with the result that one misses both.",
                List.of("He tried to please both clients and ended up being caught between two stools.",
                        "The compromise failed, and the board was caught between two stools.")));

        IDIOM_LIST.add(new Idiom(366, 'c', "Chip Off the Old Block", "A son or daughter who resembles his or her father or mother.",
                List.of("He’s a chip off the old block—just as stubborn as his dad.",
                        "She is a chip off the old block, following her mother into medicine.")));

        IDIOM_LIST.add(new Idiom(367, 'c', "Clean Slate", "A fresh start; an opportunity to begin again without prejudice or past mistakes counting against you.",
                List.of("The new manager promised everyone a clean slate.",
                        "He moved to a new city to begin with a clean slate.")));

        IDIOM_LIST.add(new Idiom(368, 'c', "Come Clean", "To confess or reveal the truth about something.",
                List.of("The politician finally came clean about the scandal.",
                        "It’s better to come clean now than to wait until you are caught.")));

        IDIOM_LIST.add(new Idiom(369, 'c', "Couch Potato", "A person who spends a lot of time sitting or lying down, watching television, etc.",
                List.of("Since retiring, my dad has become a total couch potato.",
                        "I felt like a couch potato after watching movies all weekend.")));

        IDIOM_LIST.add(new Idiom(370, 'd', "Devil May Care", "Reckless, careless, or indifferent; having a casual disregard for serious matters.",
                List.of("He had a devil may care attitude toward his finances.",
                        "The young explorers had a devil may care spirit about danger.")));

        IDIOM_LIST.add(new Idiom(371, 'd', "Down the Drain", "Wasted or lost completely.",
                List.of("All that money spent on the failed project went straight down the drain.",
                        "If we don't finish this, all our hard work will go down the drain.")));

        IDIOM_LIST.add(new Idiom(372, 'e', "Every Dog Has Its Day", "Everyone gets a chance to succeed or be lucky at some point.",
                List.of("Don't worry about losing this time; every dog has its day.",
                        "He finally won the championship after years of trying; every dog has its day.")));

        IDIOM_LIST.add(new Idiom(373, 'f', "Fine-Tooth Comb", "To search for something or examine something in great detail.",
                List.of("The detectives went over the crime scene with a fine-tooth comb.",
                        "I need to go through this contract with a fine-tooth comb before signing.")));

        IDIOM_LIST.add(new Idiom(374, 'g', "Get the Lowdown", "To get the true or essential information about something.",
                List.of("I called my friend to get the lowdown on the new office gossip.",
                        "Let's meet up and I'll give you the lowdown on the event.")));

        IDIOM_LIST.add(new Idiom(375, 'g', "Go With the Flow", "To be relaxed and accept a situation as it happens.",
                List.of("We didn't have a plan for the trip; we just decided to go with the flow.",
                        "When the schedule changed, she calmly went with the flow.")));

        IDIOM_LIST.add(new Idiom(376, 'h', "Hands Are Tied", "Unable to help or act because of rules, laws, or circumstances.",
                List.of("I'd love to approve the spending, but my hands are tied by the budget rules.",
                        "The staff complained that their hands were tied due to strict regulations.")));

        IDIOM_LIST.add(new Idiom(377, 'h', "Head Over Heels", "Deeply in love.",
                List.of("They are head over heels in love and plan to marry next year.",
                        "He fell head over heels for her the moment they met.")));

        IDIOM_LIST.add(new Idiom(378, 'h', "Hit the Jackpot", "To achieve great success, often unexpectedly.",
                List.of("He hit the jackpot with his first investment in cryptocurrency.",
                        "We hit the jackpot when we found that perfect house at a low price.")));

        IDIOM_LIST.add(new Idiom(379, 'i', "In the Driver's Seat", "In control of a situation.",
                List.of("Since the promotion, she's been in the driver's seat for all strategic decisions.",
                        "It’s good to finally be in the driver's seat after years of following orders.")));

        IDIOM_LIST.add(new Idiom(380, 'i', "In Your Court", "It is now your responsibility to take action or make a decision.",
                List.of("We’ve sent the proposal; the ball is in your court now.",
                        "I've done all I can; the final decision is in your court.")));

        IDIOM_LIST.add(new Idiom(381, 'j', "Jump Down Someone's Throat", "To criticize or speak angrily to someone, often without provocation.",
                List.of("I just asked a simple question, but he immediately jumped down my throat.",
                        "Don't jump down his throat; he didn't mean any harm.")));

        IDIOM_LIST.add(new Idiom(382, 'k', "Keep a Lid On", "To keep something secret or controlled; to prevent something from becoming public or out of control.",
                List.of("The company tried to keep a lid on the layoff rumors.",
                        "We need to keep a lid on this discussion until we have all the facts.")));

        IDIOM_LIST.add(new Idiom(383, 'l', "Lame Duck", "An elected official or group continuing in office during the period between an election defeat and a successor's assumption of office.",
                List.of("The former president became a lame duck after the November election.",
                        "The committee is now a lame duck and can't pass major legislation.")));

        IDIOM_LIST.add(new Idiom(384, 'l', "Long Shot", "An attempt or venture that has only a slight chance of succeeding.",
                List.of("Applying for that job was a long shot, but she got an interview.",
                        "It was a long shot, but their risky strategy paid off.")));

        IDIOM_LIST.add(new Idiom(385, 'm', "Make Light of", "To treat something as unimportant or trivial, especially when it is serious.",
                List.of("He tried to make light of the accident to reassure the others.",
                        "Don't make light of her achievements; they took a lot of hard work.")));

        IDIOM_LIST.add(new Idiom(386, 'n', "New Blood", "New members in a group or organization, especially ones who bring new ideas and energy.",
                List.of("The organization desperately needs some new blood to revitalize its efforts.",
                        "Hiring recent graduates brought new blood into the stagnant department.")));

        IDIOM_LIST.add(new Idiom(387, 'o', "Off the Record", "Not intended to be made public or quoted officially.",
                List.of("The source spoke to the journalist strictly off the record.",
                        "Everything said in this private meeting is completely off the record.")));

        IDIOM_LIST.add(new Idiom(388, 'o', "On the Back Burner", "Delayed or put aside temporarily.",
                List.of("The expansion plans were put on the back burner due to lack of funds.",
                        "We have a few other tasks that are on the back burner right now.")));

        IDIOM_LIST.add(new Idiom(389, 'p', "Peanut Gallery", "A group of people giving unwanted and usually unqualified criticism or commentary.",
                List.of("He ignored the noise from the peanut gallery and continued his speech.",
                        "Stop listening to the peanut gallery and trust your own judgment.")));

        IDIOM_LIST.add(new Idiom(390, 'p', "Poker Face", "An expressionless face, revealing no emotion, that prevents others from knowing what one is thinking.",
                List.of("She maintained a perfect poker face during the high-stakes negotiation.",
                        "It’s hard to read his intentions; he always has a poker face.")));

        IDIOM_LIST.add(new Idiom(391, 'r', "Raise the Bar", "To increase the standard that is expected or required.",
                List.of("The new artistic director immediately raised the bar for all performances.",
                        "Our goal is to raise the bar for customer service in the industry.")));

        IDIOM_LIST.add(new Idiom(392, 'r', "Read the Writing on the Wall", "To recognize and understand a clear indication of how a situation is likely to develop.",
                List.of("When sales dropped sharply, the CEO read the writing on the wall and prepared for cuts.",
                        "The company ignored the writing on the wall and failed to adapt.")));

        IDIOM_LIST.add(new Idiom(393, 's', "Safe Bet", "Something that is almost certain to happen; a sure thing.",
                List.of("It's a safe bet that the new film will be a box office hit.",
                        "I'd say it's a safe bet that the meeting will run late.")));

        IDIOM_LIST.add(new Idiom(394, 's', "Show of Hands", "A vote or indication of opinion made by people raising their hands.",
                List.of("Let's have a show of hands: who is in favor of the proposal?",
                        "By a show of hands, the motion passed easily.")));

        IDIOM_LIST.add(new Idiom(395, 's', "Slow and Steady Wins the Race", "A proverb meaning that reliable effort over a long time is better than a quick burst of energy.",
                List.of("Don't rush the project; slow and steady wins the race.",
                        "He consistently practiced small amounts, proving that slow and steady wins the race.")));

        IDIOM_LIST.add(new Idiom(396, 't', "Take the Edge Off", "To slightly moderate or lessen the intensity of something, often pain or tension.",
                List.of("A small snack helped take the edge off her hunger.",
                        "The comedian's opening monologue took the edge off the serious atmosphere.")));

        IDIOM_LIST.add(new Idiom(397, 't', "Take the Heat", "To endure the criticism or blame for something.",
                List.of("The manager had to take the heat for the team's mistakes.",
                        "He was willing to take the heat for the unpopular decision.")));

        IDIOM_LIST.add(new Idiom(398, 't', "Through the Wringer", "To go through a difficult or stressful experience.",
                List.of("The candidate was put through the wringer during the intense interview process.",
                        "After the audit, the entire department felt like they had been put through the wringer.")));

        IDIOM_LIST.add(new Idiom(399, 'u', "Under the Wire", "At the last possible moment; barely on time.",
                List.of("She finished her painting and submitted it just under the wire.",
                        "We got the documents filed under the wire, just before the deadline.")));

        IDIOM_LIST.add(new Idiom(400, 'w', "White Lie", "A harmless or trivial lie told to avoid hurting someone's feelings or to maintain harmony.",
                List.of("I told a white lie about liking her dress to save her feelings.",
                        "Telling him the dinner was perfect was just a white lie.")));
        IDIOM_LIST.add(new Idiom(401, 'a', "Around the Clock", "All day and all night; continuously.",
                List.of("The emergency crew worked around the clock to restore power.",
                        "The factory operates around the clock to meet demand.")));

        IDIOM_LIST.add(new Idiom(402, 'b', "Batting a Thousand", "Having a perfect record; succeeding at everything.",
                List.of("The salesperson has been batting a thousand this quarter, closing every deal.",
                        "The new system is batting a thousand, with zero errors so far.")));

        IDIOM_LIST.add(new Idiom(403, 'b', "Beauty is in the Eye of the Beholder", "What one person finds beautiful, another may not.",
                List.of("I don't like the painting, but I guess beauty is in the eye of the beholder.",
                        "Don't worry about her opinion of your dress; beauty is in the eye of the beholder.")));

        IDIOM_LIST.add(new Idiom(404, 'b', "Best of Both Worlds", "A situation in which one can enjoy the benefits of two different, sometimes contradictory, things.",
                List.of("Working freelance allows me the best of both worlds: a career and flexibility.",
                        "The hybrid car offers the best of both worlds: power and fuel efficiency.")));

        IDIOM_LIST.add(new Idiom(405, 'b', "Between the Devil and the Deep Blue Sea", "Faced with a choice between two equally undesirable options.",
                List.of("He was caught between the devil and the deep blue sea: confess or face jail time.",
                        "The company is between the devil and the deep blue sea regarding layoffs.")));

        IDIOM_LIST.add(new Idiom(406, 'b', "Big Cheese", "An important, influential, or powerful person.",
                List.of("The big cheese himself is coming to inspect the factory.",
                        "She is the big cheese of the whole operation.")));

        IDIOM_LIST.add(new Idiom(407, 'b', "Bird's-Eye View", "A view from a high angle, giving a comprehensive overall look.",
                List.of("We got a bird's-eye view of the city from the top of the skyscraper.",
                        "The drone footage gave us a bird's-eye view of the construction site.")));

        IDIOM_LIST.add(new Idiom(408, 'b', "Blow Off Steam", "To express strong feelings or energy in order to relieve stress.",
                List.of("After a difficult week, he needed to go to the gym to blow off steam.",
                        "Let him complain for a minute; he just needs to blow off steam.")));

        IDIOM_LIST.add(new Idiom(409, 'c', "Calm Before the Storm", "A period of unusual quiet or stability preceding a time of great activity, trouble, or excitement.",
                List.of("The quiet morning was the calm before the storm of the holiday rush.",
                        "Enjoy the calm before the storm of exam week.")));

        IDIOM_LIST.add(new Idiom(410, 'c', "Carry a Torch", "To maintain an unrequited or hopeless love for someone.",
                List.of("Even years later, he still carries a torch for his high school sweetheart.",
                        "She quietly carried a torch for her colleague.")));

        IDIOM_LIST.add(new Idiom(411, 'c', "Catch Someone's Eye", "To attract someone's attention.",
                List.of("The brightly colored dress immediately caught her eye.",
                        "He waved his hand to catch the waiter's eye.")));

        IDIOM_LIST.add(new Idiom(412, 'c', "Couch Potato", "A lazy person who spends too much time watching television.",
                List.of("He has become a couch potato since he retired.",
                        "Don't be a couch potato all weekend; go outside!")));

        IDIOM_LIST.add(new Idiom(413, 'c', "Cross That Bridge When You Come To It", "To deal with a problem only when it actually arises.",
                List.of("I don't know how we'll fund the expansion yet, but we'll cross that bridge when we come to it.",
                        "Let's not worry about packing the books now; we'll cross that bridge when we come to it.")));

        IDIOM_LIST.add(new Idiom(414, 'c', "Cut Corners", "To do something in the easiest, fastest, or cheapest way, often sacrificing quality.",
                List.of("You can't cut corners when building a house; safety is paramount.",
                        "The company cut corners on materials, which led to defects.")));

        IDIOM_LIST.add(new Idiom(415, 'd', "Dark Horse", "A political candidate or competitor who is unexpectedly successful.",
                List.of("The relatively unknown runner proved to be the dark horse of the competition.",
                        "No one expected her to win; she was the dark horse in the race.")));

        IDIOM_LIST.add(new Idiom(416, 'd', "Dead End", "A situation from which no progress can be made.",
                List.of("The investigation reached a dead end when the key witness disappeared.",
                        "After three years, his career felt like it had hit a dead end.")));

        IDIOM_LIST.add(new Idiom(417, 'd', "Down to Earth", "Practical, realistic, and sensible.",
                List.of("Despite her fame, the actress is very down to earth.",
                        "We need a down to earth approach to solve this problem.")));

        IDIOM_LIST.add(new Idiom(418, 'd', "Drive Someone Up the Wall", "To irritate or annoy someone greatly.",
                List.of("His constant tapping drives me up the wall.",
                        "The never-ending questions were driving the teacher up the wall.")));

        IDIOM_LIST.add(new Idiom(419, 'e', "Easy Come, Easy Go", "Something gained easily is also lost easily.",
                List.of("He lost all his winnings at the casino, saying, 'Easy come, easy go.'",
                        "I spent the bonus almost immediately; easy come, easy go.")));

        IDIOM_LIST.add(new Idiom(420, 'e', "Every Cloud Has a Silver Lining", "Every difficult or unpleasant situation has some positive side.",
                List.of("Losing my job was tough, but every cloud has a silver lining; I started my own business.",
                        "Look for the silver lining in every setback.")));

        IDIOM_LIST.add(new Idiom(421, 'f', "Face the Music", "To accept the unpleasant consequences of one's actions.",
                List.of("After cheating, he knew he had to face the music with his parents.",
                        "The company must face the music for its illegal actions.")));

        IDIOM_LIST.add(new Idiom(422, 'f', "Fair-Weather Friend", "A person who is only your friend when things are going well and abandons you during difficult times.",
                List.of("He disappeared as soon as I lost my job; he was just a fair-weather friend.",
                        "Don't rely on him; he's a fair-weather friend at best.")));

        IDIOM_LIST.add(new Idiom(423, 'f', "Feast or Famine", "A situation of alternating periods of great abundance and severe lack.",
                List.of("The sales cycle is feast or famine; one month we have too many orders, the next, none.",
                        "Life as a freelance artist is often feast or famine.")));

        IDIOM_LIST.add(new Idiom(424, 'g', "Get a Taste of Your Own Medicine", "To receive the same negative treatment that you have given to others.",
                List.of("She was always gossiping, so it was time she got a taste of her own medicine.",
                        "The bully finally got a taste of his own medicine.")));

        IDIOM_LIST.add(new Idiom(425, 'g', "Go with the Flow", "To be relaxed and accept a situation as it happens.",
                List.of("The itinerary changed last minute, but we just decided to go with the flow.",
                        "Don't try to control everything; sometimes you just need to go with the flow.")));

        IDIOM_LIST.add(new Idiom(426, 'h', "Have Cold Feet", "To feel nervous or anxious about something, particularly a major commitment.",
                List.of("He got cold feet the night before the wedding.",
                        "Don't have cold feet now; we are too close to the finish line.")));

        IDIOM_LIST.add(new Idiom(427, 'h', "Hit the Nail on the Head", "To describe exactly what is causing a situation or problem.",
                List.of("You hit the nail on the head when you mentioned communication issues.",
                        "Her summary of the project's flaw hit the nail on the head.")));

        IDIOM_LIST.add(new Idiom(428, 'i', "In the Air", "A feeling or idea that is starting to be widely expressed or recognized.",
                List.of("An atmosphere of excitement was in the air before the championship game.",
                        "The feeling of change has been in the air for weeks.")));

        IDIOM_LIST.add(new Idiom(429, 'i', "In the Dark", "Uninformed; unaware of essential facts.",
                List.of("The board made the decision and left the rest of us completely in the dark.",
                        "I was in the dark about the surprise party until the last minute.")));

        IDIOM_LIST.add(new Idiom(430, 'j', "Jump Down Someone's Throat", "To criticize or speak angrily to someone, often without provocation.",
                List.of("He just asked a simple question; there was no need to jump down his throat.",
                        "Don't jump down my throat; I was just trying to help.")));

        IDIOM_LIST.add(new Idiom(431, 'k', "Keep Your Chin Up", "To remain cheerful and optimistic in difficult times.",
                List.of("I know you failed the test, but keep your chin up.",
                        "She told him to keep his chin up after the tough loss.")));

        IDIOM_LIST.add(new Idiom(432, 'l', "Let Sleeping Dogs Lie", "To leave a situation undisturbed because getting involved could cause trouble.",
                List.of("It's an old argument that's best forgotten; just let sleeping dogs lie.",
                        "Don't bring up the past controversy; let sleeping dogs lie.")));

        IDIOM_LIST.add(new Idiom(433, 'l', "Light at the End of the Tunnel", "A sign that a difficult period is almost over.",
                List.of("We've worked so hard, but now we can see the light at the end of the tunnel.",
                        "The discovery offers a light at the end of the tunnel for medical research.")));

        IDIOM_LIST.add(new Idiom(434, 'm', "Make Waves", "To cause trouble or excitement by challenging the status quo.",
                List.of("The new intern is making waves with her innovative ideas.",
                        "He tends to make waves in every meeting he attends.")));

        IDIOM_LIST.add(new Idiom(435, 'n', "Not My Cup of Tea", "Something that is not to one's liking or preference.",
                List.of("Camping is fun for some, but it's not my cup of tea.",
                        "I tried extreme sports, but it's just not my cup of tea.")));

        IDIOM_LIST.add(new Idiom(436, 'o', "On the Fence", "Undecided about two possible choices.",
                List.of("I'm on the fence about whether to sell the car or keep it.",
                        "The committee is still on the fence regarding the merger.")));

        IDIOM_LIST.add(new Idiom(437, 'o', "Once in a Blue Moon", "Very rarely.",
                List.of("We only go to the theater once in a blue moon.",
                        "She bakes a cake once in a blue moon.")));

        IDIOM_LIST.add(new Idiom(438, 'o', "Open a Can of Worms", "To create a complex situation or unleash a number of unpredictable problems.",
                List.of("Investigating the old records might open a can of worms.",
                        "Be careful discussing taxes; you might open a can of worms.")));

        IDIOM_LIST.add(new Idiom(439, 'p', "Pass the Buck", "To shift blame or responsibility to another person.",
                List.of("The director always passes the buck when things go wrong.",
                        "Stop passing the buck and admit your part in the mistake.")));

        IDIOM_LIST.add(new Idiom(440, 'p', "Piece of Cake", "Something that is very easy to do.",
                List.of("The assignment was a piece of cake after all the studying I did.",
                        "Learning to use the new machine was a piece of cake.")));

        IDIOM_LIST.add(new Idiom(441, 'p', "Pull Someone's Leg", "To joke with someone; to tease or trick them.",
                List.of("Don't worry, I'm just pulling your leg—I didn't really spill coffee on your computer.",
                        "Is he serious, or is he pulling my leg?")));

        IDIOM_LIST.add(new Idiom(442, 'r', "Rain on Someone's Parade", "To spoil someone's pleasure or plans.",
                List.of("I hate to rain on your parade, but the event is cancelled.",
                        "Don't let anyone rain on your parade just because they are jealous.")));

        IDIOM_LIST.add(new Idiom(443, 'r', "Read Between the Lines", "To discern a hidden meaning or message that is not explicitly stated.",
                List.of("The memo was vague, but if you read between the lines, you can tell they are worried.",
                        "You need to read between the lines of his resignation letter.")));

        IDIOM_LIST.add(new Idiom(444, 'r', "Red Tape", "Excessive official rules and procedures that create delays and difficulty.",
                List.of("Getting the permit required too much red tape.",
                        "We need to cut through the red tape to speed up the process.")));

        IDIOM_LIST.add(new Idiom(445, 's', "Safe and Sound", "Uninjured, unharmed, or secure.",
                List.of("The children arrived home safe and sound after the long journey.",
                        "Despite the rough seas, the boat returned safe and sound.")));

        IDIOM_LIST.add(new Idiom(446, 's', "See Eye to Eye", "To agree completely.",
                List.of("They have a great partnership because they see eye to eye on most things.",
                        "We don't always see eye to eye, but we respect each other's views.")));

        IDIOM_LIST.add(new Idiom(447, 's', "Spill the Beans", "To reveal secret or confidential information.",
                List.of("Who spilled the beans about the surprise party?",
                        "Don't spill the beans about the engagement until they announce it.")));

        IDIOM_LIST.add(new Idiom(448, 's', "Straight from the Horse's Mouth", "Information received directly from the most reliable source.",
                List.of("I heard the news straight from the horse's mouth, so it must be true.",
                        "Don't believe the rumors; get it straight from the horse's mouth.")));

        IDIOM_LIST.add(new Idiom(449, 't', "Take a Rain Check", "To politely refuse an offer, with the implication that one may accept it at a later date.",
                List.of("I can't join you for dinner tonight, but I'll take a rain check.",
                        "He was too busy to meet, so we took a rain check for next month.")));

        IDIOM_LIST.add(new Idiom(450, 't', "Take It With a Grain of Salt", "To not believe something completely; to maintain a degree of skepticism.",
                List.of("His predictions are usually exaggerated, so take them with a grain of salt.",
                        "I take all online comments with a grain of salt.")));
        IDIOM_LIST.add(new Idiom(451, 't', "The Ball is in Your Court", "It is up to you to make the next decision or step.",
                List.of("I've given you my final offer; the ball is in your court now.",
                        "She finished her part of the project, and now the ball is in his court.")));

        IDIOM_LIST.add(new Idiom(452, 't', "The Best Thing Since Sliced Bread", "An excellent new invention or development.",
                List.of("This new coffee machine is the best thing since sliced bread.",
                        "Everyone thinks the new software is the best thing since sliced bread.")));

        IDIOM_LIST.add(new Idiom(453, 't', "The Devil is in the Details", "Even simple tasks can be complicated due to subtle but crucial details.",
                List.of("The general plan is fine, but be careful—the devil is in the details.",
                        "We need to re-read the contract, because the devil is always in the details.")));

        IDIOM_LIST.add(new Idiom(454, 't', "The Eleventh Hour", "The last possible moment.",
                List.of("He submitted his application at the eleventh hour.",
                        "The contract was approved at the eleventh hour before the deadline.")));

        IDIOM_LIST.add(new Idiom(455, 't', "The Last Straw", "The final problem in a series of problems that causes someone to lose patience.",
                List.of("His constant tardiness was annoying, but breaking the equipment was the last straw.",
                        "The massive price hike was the last straw for customers.")));

        IDIOM_LIST.add(new Idiom(456, 't', "Throw Caution to the Wind", "To act recklessly or without regard to prudence.",
                List.of("Tired of careful budgeting, she decided to throw caution to the wind and buy the expensive shoes.",
                        "They threw caution to the wind and invested all their savings in the startup.")));

        IDIOM_LIST.add(new Idiom(457, 't', "Throw In the Towel", "To give up; to admit defeat.",
                List.of("After losing the first three rounds, he decided to throw in the towel.",
                        "Don't throw in the towel now; you are so close to finishing!")));

        IDIOM_LIST.add(new Idiom(458, 't', "Touch Base", "To briefly make contact or check in with someone.",
                List.of("I'll touch base with you tomorrow morning to discuss the proposal.",
                        "Let's touch base with the client before the end of the week.")));

        IDIOM_LIST.add(new Idiom(459, 't', "Turn a Blind Eye", "To intentionally ignore a situation or behavior that you know is wrong.",
                List.of("The security officer decided to turn a blind eye to the minor infraction.",
                        "The boss was accused of turning a blind eye to the safety violations.")));

        IDIOM_LIST.add(new Idiom(460, 't', "Two Peas in a Pod", "Two people who are very similar in appearance, behavior, or interests.",
                List.of("The twins are two peas in a pod; they finish each other's sentences.",
                        "They both love obscure music; they are two peas in a pod.")));

        IDIOM_LIST.add(new Idiom(461, 'u', "Under the Gun", "Under pressure or stress, typically because of an approaching deadline.",
                List.of("We are under the gun to complete the project by Friday.",
                        "The whole team is under the gun to meet quarterly sales goals.")));

        IDIOM_LIST.add(new Idiom(462, 'w', "Walk on Eggshells", "To be very careful and cautious in one's actions or words to avoid offending someone.",
                List.of("Ever since the argument, I've had to walk on eggshells around him.",
                        "The interns feel like they are walking on eggshells around the strict supervisor.")));

        IDIOM_LIST.add(new Idiom(463, 'w', "Water Under the Bridge", "Something that happened in the past and is now over and forgotten.",
                List.of("I'm not worried about that old debt; it's water under the bridge.",
                        "Our disagreement from last year is water under the bridge now.")));

        IDIOM_LIST.add(new Idiom(464, 'w', "Wear Your Heart on Your Sleeve", "To openly and freely express your emotions rather than keeping them hidden.",
                List.of("She wears her heart on her sleeve, so you always know how she feels.",
                        "He's too honest; he always wears his heart on his sleeve.")));

        IDIOM_LIST.add(new Idiom(465, 'w', "When Pigs Fly", "Something that will never happen; impossible.",
                List.of("He'll admit he was wrong when pigs fly.",
                        "The company will give us all a raise when pigs fly.")));

        IDIOM_LIST.add(new Idiom(466, 'w', "White Elephant", "A possession that is useless, troublesome, or expensive to maintain.",
                List.of("The unused swimming pool became a white elephant for the homeowners.",
                        "That broken machine is a white elephant; it costs more to repair than replace.")));

        IDIOM_LIST.add(new Idiom(467, 'w', "Wild Goose Chase", "A hopeless, complicated, or aimless search for something.",
                List.of("Following those old directions was a total wild goose chase.",
                        "Sending me to three different offices for one signature felt like a wild goose chase.")));

        IDIOM_LIST.add(new Idiom(468, 'w', "Word of Mouth", "Information passed from person to person through speaking.",
                List.of("The restaurant relies solely on word of mouth advertising.",
                        "We heard about the event through word of mouth.")));

        IDIOM_LIST.add(new Idiom(469, 'w', "Worth Its Weight in Gold", "Extremely valuable or useful.",
                List.of("The emergency technician was worth his weight in gold during the power outage.",
                        "This software shortcut is worth its weight in gold to the developers.")));

        IDIOM_LIST.add(new Idiom(470, 'y', "You Can't Teach an Old Dog New Tricks", "It is difficult to change a person's established habits or way of thinking.",
                List.of("He refuses to use email; you can't teach an old dog new tricks.",
                        "Changing the entire corporate culture proved that you can't teach an old dog new tricks.")));

        IDIOM_LIST.add(new Idiom(471, 'a', "An Arm and a Leg", "Very expensive or costly.",
                List.of("That tiny apartment costs an arm and a leg in this city.",
                        "The repairs cost us an arm and a leg.")));

        IDIOM_LIST.add(new Idiom(472, 'b', "Beat Around the Bush", "To avoid getting to the point; speaking indirectly.",
                List.of("Stop beating around the bush and tell me the actual problem.",
                        "The politician spent ten minutes beating around the bush instead of answering the question.")));

        IDIOM_LIST.add(new Idiom(473, 'b', "Bite the Bullet", "To endure a painful or unpleasant situation that is unavoidable.",
                List.of("The only way to finish this painful job is to bite the bullet and do it.",
                        "He had to bite the bullet and apologize for his terrible mistake.")));

        IDIOM_LIST.add(new Idiom(474, 'c', "Caught Between Two Stools", "Caught between two alternatives, with the result that one misses both.",
                List.of("He tried to please both clients and ended up being caught between two stools.",
                        "The board was caught between two stools and couldn't pass any motion.")));

        IDIOM_LIST.add(new Idiom(475, 'c', "Clean Slate", "A fresh start; an opportunity to begin again without prejudice or past mistakes counting against you.",
                List.of("The new coach gave the team a clean slate for the next season.",
                        "After bankruptcy, he was ready for a clean slate.")));

        IDIOM_LIST.add(new Idiom(476, 'c', "Cold Turkey", "Abruptly and completely stopping an addictive or habitual behavior.",
                List.of("She quit smoking cold turkey last year and hasn't looked back.",
                        "He decided to stop drinking coffee cold turkey.")));

        IDIOM_LIST.add(new Idiom(477, 'd', "Donkey's Years", "A very long time.",
                List.of("I haven't seen that movie in donkey's years!",
                        "It took the bureaucracy donkey's years to approve the paperwork.")));

        IDIOM_LIST.add(new Idiom(478, 'e', "Every Dog Has Its Day", "Everyone gets a chance to succeed or be lucky at some point.",
                List.of("Don't worry about this failure; every dog has its day.",
                        "He finally won the lottery; every dog has its day.")));

        IDIOM_LIST.add(new Idiom(479, 'f', "Feather in One's Cap", "An achievement or something to be proud of.",
                List.of("Getting published was a major feather in her cap.",
                        "Winning the industry award was a big feather in the company's cap.")));

        IDIOM_LIST.add(new Idiom(480, 'f', "Fine-Tooth Comb", "To search for something or examine something in great detail.",
                List.of("The editor went over the manuscript with a fine-tooth comb.",
                        "The auditors searched the expense reports with a fine-tooth comb.")));

        IDIOM_LIST.add(new Idiom(481, 'g', "Get Off On The Wrong Foot", "To start a relationship or activity badly.",
                List.of("I think I got off on the wrong foot with my new boss by being late.",
                        "The partnership got off on the wrong foot with a major disagreement.")));

        IDIOM_LIST.add(new Idiom(482, 'h', "Hanging by a Thread", "In a very dangerous or precarious situation.",
                List.of("The company's survival is hanging by a thread after the scandal.",
                        "His future in the league is hanging by a thread.")));

        IDIOM_LIST.add(new Idiom(483, 'h', "Hit the Sack", "To go to bed.",
                List.of("I'm exhausted from working late; I need to hit the sack.",
                        "It's late; time to hit the sack.")));

        IDIOM_LIST.add(new Idiom(484, 'i', "In the Same Boat", "To be in the same difficult circumstances as others.",
                List.of("We are all facing budget cuts, so we are in the same boat.",
                        "Don't worry; we are all confused by the rules—we are in the same boat.")));

        IDIOM_LIST.add(new Idiom(485, 'j', "Jump the Gun", "To start something too soon or prematurely.",
                List.of("He announced the engagement before she said yes; he jumped the gun.",
                        "Let's wait for the full results before celebrating; don't jump the gun.")));

        IDIOM_LIST.add(new Idiom(486, 'k', "Keep a Straight Face", "To manage to look serious and avoid laughing.",
                List.of("The joke was so funny that she struggled to keep a straight face.",
                        "He tried to keep a straight face while telling the ridiculous story.")));

        IDIOM_LIST.add(new Idiom(487, 'l', "Lame Duck", "An elected official or group continuing in office during the period between an election defeat and a successor's assumption of office.",
                List.of("The outgoing president is a lame duck until the inauguration.",
                        "The committee is a lame duck since their funding was cut.")));

        IDIOM_LIST.add(new Idiom(488, 'l', "Leaps and Bounds", "By a very large degree; rapidly.",
                List.of("The business is growing by leaps and bounds this quarter.",
                        "Her recovery is progressing by leaps and bounds.")));

        IDIOM_LIST.add(new Idiom(489, 'm', "Make Ends Meet", "To earn just enough money to live on.",
                List.of("After his hours were cut, he struggled to make ends meet.",
                        "Many people work two jobs just to make ends meet.")));

        IDIOM_LIST.add(new Idiom(490, 'n', "New Lease on Life", "A renewed energy or interest in life; a fresh start.",
                List.of("After the surgery, he felt he had a new lease on life.",
                        "The renovation gave the old car a new lease on life.")));

        IDIOM_LIST.add(new Idiom(491, 'o', "On the Back Burner", "Delayed or put aside temporarily.",
                List.of("The expansion plans were put on the back burner due to lack of funds.",
                        "We have a few other tasks that are on the back burner right now.")));

        IDIOM_LIST.add(new Idiom(492, 'p', "Pass the Torch", "To hand down a responsibility or knowledge to the next generation or successor.",
                List.of("The retiring CEO will pass the torch to her successor next month.",
                        "The older musician passed the torch of leadership to the younger band member.")));

        IDIOM_LIST.add(new Idiom(493, 'q', "Quick and Dirty", "Done or achieved quickly, usually with low quality or without careful attention to detail.",
                List.of("I just need a quick and dirty estimate, not a full report.",
                        "The programmer offered a quick and dirty solution to the bug.")));

        IDIOM_LIST.add(new Idiom(494, 'r', "Read the Riot Act", "To issue a stern warning with clear consequences for misbehavior.",
                List.of("The principal read the riot act to the disruptive students.",
                        "The boss read the riot act to the team after they missed the deadline.")));

        IDIOM_LIST.add(new Idiom(495, 'r', "Recharge One's Batteries", "To rest and regain energy.",
                List.of("I'm taking a vacation to the beach to recharge my batteries.",
                        "She needs a quiet weekend at home to recharge her batteries.")));

        IDIOM_LIST.add(new Idiom(496, 's', "Safe Bet", "Something that is almost certain to happen; a sure thing.",
                List.of("It's a safe bet that the show will sell out opening night.",
                        "I'd say it's a safe bet that the train will be delayed.")));

        IDIOM_LIST.add(new Idiom(497, 't', "Take the Edge Off", "To slightly moderate or lessen the intensity of something, often pain or tension.",
                List.of("A good cup of tea helps take the edge off a stressful morning.",
                        "He took a brief walk to take the edge off his anger.")));

        IDIOM_LIST.add(new Idiom(498, 't', "Tie the Knot", "To get married.",
                List.of("They are excited to tie the knot in a mountain ceremony next fall.",
                        "We decided to tie the knot quickly at the city hall.")));

        IDIOM_LIST.add(new Idiom(499, 'w', "Without a Hitch", "Without any problems or difficulties.",
                List.of("The entire conference went off without a hitch.",
                        "The complicated operation was performed without a hitch.")));

        IDIOM_LIST.add(new Idiom(500, 'w', "Wrap Up", "To complete or finish something.",
                List.of("Let's wrap up this discussion and move to the next topic.",
                        "We need an hour to wrap up the packing.")));
        IDIOM_LIST.add(new Idiom(501, 'a', "Actions Speak Louder Than Words", "What you do is more important than what you say.",
                List.of("He promised to help, but until he shows up, actions speak louder than words.",
                        "The company changed its policy, proving that actions speak louder than words.")));

        IDIOM_LIST.add(new Idiom(502, 'a', "All in the Same Boat", "To be in the same difficult or unfortunate circumstances as others.",
                List.of("We all missed the deadline, so we're all in the same boat.",
                        "No one got a bonus this year, so we are all in the same boat.")));

        IDIOM_LIST.add(new Idiom(503, 'a', "An Ace Up One's Sleeve", "A secret or hidden advantage that one can use when needed.",
                List.of("The lawyer kept an ace up his sleeve until the final court appearance.",
                        "Having a second job offer was my ace up the sleeve during the salary negotiation.")));

        IDIOM_LIST.add(new Idiom(504, 'b', "Back to Square One", "To return to the beginning, often because of a failure or mistake.",
                List.of("The whole design was rejected, so we are back to square one.",
                        "We need to start from scratch and go back to square one.")));

        IDIOM_LIST.add(new Idiom(505, 'b', "Bake a Cake", "To prepare a cake (Used here as a simple example to continue a sequence).",
                List.of("She spent the afternoon baking a cake for the party.",
                        "My favorite thing to do on a rainy day is to bake a cake.")));

        IDIOM_LIST.add(new Idiom(506, 'b', "Bite the Dust", "To die, or to break down and stop working.",
                List.of("The old lawnmower finally bit the dust after twenty years.",
                        "The villain was defeated and bit the dust in the final scene.")));

        IDIOM_LIST.add(new Idiom(507, 'b', "Blue in the Face", "Exhausted from great effort, especially from arguing or pleading.",
                List.of("I argued with him until I was blue in the face, but he wouldn't listen.",
                        "You can complain until you are blue in the face, but the rule won't change.")));

        IDIOM_LIST.add(new Idiom(508, 'b', "Break the Bank", "To cost too much money; to use up all of one's savings.",
                List.of("The new furniture is beautiful, but it's going to break the bank.",
                        "We can afford a small vacation, but nothing that will break the bank.")));

        IDIOM_LIST.add(new Idiom(509, 'c', "Call It a Day", "To stop working on something.",
                List.of("It's 6 PM, let's call it a day and finish this tomorrow.",
                        "I'm too tired to keep coding; I'm going to call it a day.")));

        IDIOM_LIST.add(new Idiom(510, 'c', "Compare Apples to Oranges", "To compare two items that are fundamentally different and thus cannot be reasonably compared.",
                List.of("You're comparing apples to oranges when you look at those two statistics.",
                        "Don't compare my small business to that corporation; it's comparing apples to oranges.")));

        IDIOM_LIST.add(new Idiom(511, 'c', "Cream of the Crop", "The best of a group; the highest quality.",
                List.of("This company hires only the cream of the crop from top universities.",
                        "These samples are the cream of the crop from the latest harvest.")));

        IDIOM_LIST.add(new Idiom(512, 'c', "Cross That Bridge When You Come To It", "To deal with a problem only when it actually arises.",
                List.of("We don't need to worry about transportation yet; we'll cross that bridge when we come to it.",
                        "Don't panic about that hypothetical problem; cross that bridge when you come to it.")));

        IDIOM_LIST.add(new Idiom(513, 'd', "Devil's Advocate", "A person who expresses a contentious opinion in order to provoke debate or test the strength of an argument.",
                List.of("I'll play devil's advocate for a minute and propose the opposite viewpoint.",
                        "She often takes on the role of devil's advocate to ensure we consider all risks.")));

        IDIOM_LIST.add(new Idiom(514, 'd', "Dog Days of Summer", "The hottest days of the summer.",
                List.of("We spent the dog days of summer indoors with the air conditioning.",
                        "It's hard to get outdoor work done during the dog days of summer.")));

        IDIOM_LIST.add(new Idiom(515, 'd', "Don't Count Your Chickens Before They Hatch", "Don't make plans based on a future event that may not happen.",
                List.of("You shouldn't book your flight before getting the interview; don't count your chickens before they hatch.",
                        "He spent the bonus money before it was paid, then learned why you don't count your chickens before they hatch.")));

        IDIOM_LIST.add(new Idiom(516, 'd', "Down in the Dumps", "Feeling sad, unhappy, or depressed.",
                List.of("He's been down in the dumps ever since his team lost the finals.",
                        "She was down in the dumps after receiving the bad news.")));

        IDIOM_LIST.add(new Idiom(517, 'e', "Easy Does It", "Slow down; proceed carefully.",
                List.of("Easy does it with that fragile vase!",
                        "Take your time learning the new system; easy does it.")));

        IDIOM_LIST.add(new Idiom(518, 'f', "Feast or Famine", "A situation of alternating periods of great abundance and severe lack.",
                List.of("The freelance graphic design world is often feast or famine.",
                        "The local economy seems to run on a feast or famine cycle.")));

        IDIOM_LIST.add(new Idiom(519, 'f', "Fit as a Fiddle", "In excellent health.",
                List.of("Despite his age, the marathon runner is still fit as a fiddle.",
                        "She was back to being fit as a fiddle after recovering from the flu.")));

        IDIOM_LIST.add(new Idiom(520, 'f', "Flash in the Pan", "Something that has an initial success but then fails to deliver anything lasting.",
                List.of("Everyone thought the product would be huge, but it was just a flash in the pan.",
                        "His overnight fame turned out to be a flash in the pan.")));

        IDIOM_LIST.add(new Idiom(521, 'g', "Get Off On The Wrong Foot", "To start a relationship or activity badly.",
                List.of("The two colleagues got off on the wrong foot with a misunderstanding.",
                        "We got off on the wrong foot when I accidentally called her by the wrong name.")));

        IDIOM_LIST.add(new Idiom(522, 'g', "Give Someone the Benefit of the Doubt", "To believe someone's statement, even if you are unsure if it is true, or to assume a person is innocent.",
                List.of("I didn't see him cheat, so I'll give him the benefit of the doubt.",
                        "She was late, but I gave her the benefit of the doubt that traffic was bad.")));

        IDIOM_LIST.add(new Idiom(523, 'h', "Hard Pill to Swallow", "A situation or piece of information that is difficult or unpleasant to accept.",
                List.of("The news of the demotion was a hard pill to swallow.",
                        "Accepting the harsh criticism was a hard pill to swallow.")));

        IDIOM_LIST.add(new Idiom(524, 'h', "Have the Upper Hand", "To have an advantage or be in a position of control.",
                List.of("The veteran team had the upper hand throughout the tournament.",
                        "In any negotiation, try to ensure you have the upper hand.")));

        IDIOM_LIST.add(new Idiom(525, 'i', "Ignorance is Bliss", "Not knowing something is often better than knowing it, as knowledge may cause stress or worry.",
                List.of("I don't read the news every day because sometimes ignorance is bliss.",
                        "She never checks her phone for work emails on vacation, believing ignorance is bliss.")));

        IDIOM_LIST.add(new Idiom(526, 'i', "In a Pickle", "In a difficult or messy situation.",
                List.of("I forgot my keys and wallet, so I'm in a real pickle now.",
                        "The unexpected storm left the hikers in a pickle.")));

        IDIOM_LIST.add(new Idiom(527, 'i', "Iron Out", "To resolve difficulties or disagreements.",
                List.of("We need to meet to iron out the final details of the contract.",
                        "The designers need to iron out the flaws in the prototype.")));

        IDIOM_LIST.add(new Idiom(528, 'k', "Keep a Lid On", "To keep something secret or controlled; to prevent something from becoming public or out of control.",
                List.of("The public relations team tried to keep a lid on the scandal.",
                        "We need to keep a lid on the budget spending until the audit is complete.")));

        IDIOM_LIST.add(new Idiom(529, 'k', "Know the Ropes", "To be familiar with the details and procedures of an activity or job.",
                List.of("I don't need training anymore; I know the ropes around here.",
                        "Give the new employee a few weeks to know the ropes.")));

        IDIOM_LIST.add(new Idiom(530, 'l', "Lame Duck", "An elected official or group continuing in office during the period between an election defeat and a successor's assumption of office.",
                List.of("The former mayor is a lame duck until the new one is sworn in.",
                        "The committee is essentially a lame duck after the restructuring.")));

        IDIOM_LIST.add(new Idiom(531, 'l', "Last but Not Least", "A phrase used to introduce the final item in a list, indicating it is just as important as the others.",
                List.of("My supporters include my family, my friends, and last but not least, my dedicated team.",
                        "And last but not least, let's look at the final expense report.")));

        IDIOM_LIST.add(new Idiom(532, 'l', "Let Bygones Be Bygones", "To forget about past differences or quarrels.",
                List.of("It's time to let bygones be bygones and reconcile with your brother.",
                        "We should let bygones be bygones for the sake of the team.")));

        IDIOM_LIST.add(new Idiom(533, 'l', "Like a Broken Record", "Constantly repeating the same thing.",
                List.of("He keeps giving the same excuses like a broken record.",
                        "Stop complaining about the process; you sound like a broken record.")));

        IDIOM_LIST.add(new Idiom(534, 'l', "Like Father, Like Son", "A son's character or behavior resembles that of his father.",
                List.of("He started his own business just like his dad; like father, like son.",
                        "The boy has the same artistic talent as his father; like father, like son.")));

        IDIOM_LIST.add(new Idiom(535, 'm', "Make Light of", "To treat something as unimportant or trivial, especially when it is serious.",
                List.of("He tried to make light of his injury so we wouldn't worry.",
                        "Don't make light of the team's accomplishments; they were earned.")));

        IDIOM_LIST.add(new Idiom(536, 'm', "Method to the Madness", "A purpose or reason behind seemingly irrational behavior or actions.",
                List.of("The artist's chaotic style has a method to the madness.",
                        "You may not see it now, but there is a method to the madness of my plan.")));

        IDIOM_LIST.add(new Idiom(537, 'n', "New Blood", "New members in a group or organization, especially ones who bring new ideas and energy.",
                List.of("The organization needs some new blood to revitalize its efforts.",
                        "Hiring fresh graduates brought new blood into the long-standing committee.")));

        IDIOM_LIST.add(new Idiom(538, 'n', "Not Hold Water", "Of an argument or explanation, to seem illogical, untrue, or indefensible.",
                List.of("His excuse for being absent simply does not hold water.",
                        "The defense attorney's closing statement did not hold water with the jury.")));

        IDIOM_LIST.add(new Idiom(539, 'o', "Off the Cuff", "Spoken or done without preparation; extemporaneously.",
                List.of("His acceptance speech was completely off the cuff, yet very heartfelt.",
                        "I made that suggestion off the cuff; it wasn't a formal proposal.")));

        IDIOM_LIST.add(new Idiom(540, 'o', "On the Dot", "Exactly on time; precisely.",
                List.of("The train arrived at 10:15 AM on the dot.",
                        "Make sure you are at the gate at 7:00 on the dot.")));

        IDIOM_LIST.add(new Idiom(541, 'p', "Pad the Bill", "To add extra, unnecessary charges to a bill or expense report.",
                List.of("The contractor was accused of padding the bill with inflated labor costs.",
                        "Always review the invoice carefully to ensure no one is trying to pad the bill.")));

        IDIOM_LIST.add(new Idiom(542, 'p', "Pardon My French", "An apology for using offensive or vulgar language.",
                List.of("That meeting was, pardon my French, a complete waste of time.",
                        "Pardon my French, but that's a truly ridiculous situation.")));

        IDIOM_LIST.add(new Idiom(543, 'p', "Peanut Gallery", "A group of people giving unwanted and usually unqualified criticism or commentary.",
                List.of("Ignore the comments from the peanut gallery and focus on your goal.",
                        "The politicians were heckled by the peanut gallery during the town hall.")));

        IDIOM_LIST.add(new Idiom(544, 'p', "Penny-Pinching", "Being very careful with money; frugal or stingy.",
                List.of("The company's penny-pinching policies frustrated the employees.",
                        "You don't need to be so penny-pinching; we can afford the good coffee.")));

        IDIOM_LIST.add(new Idiom(545, 'p', "Play Second Fiddle", "To take a subordinate or less important role than someone else.",
                List.of("She was tired of playing second fiddle to her overly confident partner.",
                        "He was content to play second fiddle as long as the band succeeded.")));

        IDIOM_LIST.add(new Idiom(546, 'q', "Quid Pro Quo", "A favor or advantage granted or expected in return for something else; a swap.",
                List.of("The trade deal was a simple quid pro quo between the two nations.",
                        "He expected a quid pro quo for his assistance.")));

        IDIOM_LIST.add(new Idiom(547, 'r', "Raise the Bar", "To increase the standard that is expected or required.",
                List.of("The new competition format has definitely raised the bar for all athletes.",
                        "We need to raise the bar on customer service quality.")));

        IDIOM_LIST.add(new Idiom(548, 'r', "Red-Letter Day", "A day that is memorable because of some important or happy event.",
                List.of("The day she signed the publishing contract was a red-letter day.",
                        "We always celebrate our anniversary as a red-letter day.")));

        IDIOM_LIST.add(new Idiom(549, 'r', "Reinvent the Wheel", "To waste time and effort creating something that already exists or has been done successfully.",
                List.of("We have a template for this already; don't reinvent the wheel.",
                        "There's no need to reinvent the wheel for every single project.")));

        IDIOM_LIST.add(new Idiom(550, 'r', "Rule of Thumb", "A broadly accurate guide or principle, based on experience or practice rather than theory.",
                List.of("As a rule of thumb, always arrive 15 minutes early for a flight.",
                        "The rule of thumb for watering plants is to check the soil first.")));
        IDIOM_LIST.add(new Idiom(551, 's', "Saving for a Rainy Day", "Saving money for a time when it might be needed unexpectedly.",
                List.of("She put a little bit of every paycheck away, saving for a rainy day.",
                        "It's smart to have a nest egg, always saving for a rainy day.")));

        IDIOM_LIST.add(new Idiom(552, 's', "Shake a Leg", "To hurry up; to move faster.",
                List.of("We're going to be late! Shake a leg!",
                        "Come on, shake a leg, or we'll miss the train.")));

        IDIOM_LIST.add(new Idiom(553, 's', "Shoot from the Hip", "To speak or act spontaneously, without thinking first.",
                List.of("His ideas are often good, but he tends to shoot from the hip without doing research.",
                        "The politician regretted shooting from the hip during the interview.")));

        IDIOM_LIST.add(new Idiom(554, 's', "Show of Hands", "A vote or indication of opinion made by people raising their hands.",
                List.of("Let's have a show of hands: who wants pizza for lunch?",
                        "By a show of hands, the motion passed easily.")));

        IDIOM_LIST.add(new Idiom(555, 's', "Six of One, Half Dozen of the Other", "Two alternatives that are essentially the same; it makes no difference which one is chosen.",
                List.of("Whether we start at 9 or 10, it's six of one, half dozen of the other.",
                        "You can use either brand; it's six of one, half dozen of the other.")));

        IDIOM_LIST.add(new Idiom(556, 's', "Skate on Thin Ice", "To be in a risky situation; to be doing something dangerous or likely to get one in trouble.",
                List.of("He's skating on thin ice with his boss after being late three times.",
                        "After his last warning, he knows he's skating on thin ice.")));

        IDIOM_LIST.add(new Idiom(557, 's', "Slow and Steady Wins the Race", "A proverb meaning that reliable effort over a long time is better than a quick burst of energy.",
                List.of("Don't rush the diet; slow and steady wins the race.",
                        "The company focused on incremental growth, knowing that slow and steady wins the race.")));

        IDIOM_LIST.add(new Idiom(558, 's', "Smell a Rat", "To suspect that something is wrong or dishonest.",
                List.of("When the accountant suddenly resigned, the owner started to smell a rat.",
                        "I don't trust the dealer's story; I smell a rat.")));

        IDIOM_LIST.add(new Idiom(559, 's', "Square Peg in a Round Hole", "A person who is clearly unsuited to the situation or job they are in.",
                List.of("She is a creative genius in a strictly administrative role; a square peg in a round hole.",
                        "Trying to force that solution onto the problem is like putting a square peg in a round hole.")));

        IDIOM_LIST.add(new Idiom(560, 's', "Stand One's Ground", "To maintain one's position or opinion despite opposition or pressure.",
                List.of("The witness stood her ground under intense questioning.",
                        "It takes courage to stand your ground against popular opinion.")));

        IDIOM_LIST.add(new Idiom(561, 't', "Take a Back Seat", "To accept a less important position or role.",
                List.of("After his promotion, he decided to take a back seat in the daily operations.",
                        "I was happy to take a back seat and let the others lead the meeting.")));

        IDIOM_LIST.add(new Idiom(562, 't', "Take the Bull by the Horns", "To deal with a difficult, unpleasant, or dangerous situation bravely and directly.",
                List.of("Instead of avoiding the issue, he took the bull by the horns and confronted it.",
                        "It's time for us to take the bull by the horns and start fundraising.")));

        IDIOM_LIST.add(new Idiom(563, 't', "Take the Cake", "To be the most remarkable, usually in a negative or absurd way.",
                List.of("Of all the excuses I've heard, that one takes the cake.",
                        "The sheer arrogance of the request really takes the cake.")));

        IDIOM_LIST.add(new Idiom(564, 't', "The Early Bird Gets the Worm", "Success comes to those who prepare well and arrive or act early.",
                List.of("If you want fresh produce, you need to go to the market early; the early bird gets the worm.",
                        "We started coding at dawn because the early bird gets the worm.")));

        IDIOM_LIST.add(new Idiom(565, 't', "The Gift of Gab", "The ability to speak easily and persuasively.",
                List.of("As a political pundit, she clearly has the gift of gab.",
                        "He relies on the gift of gab to charm his customers.")));

        IDIOM_LIST.add(new Idiom(566, 't', "The Midas Touch", "The ability to make money easily in any business venture.",
                List.of("Everything he invests in succeeds; he seems to have the Midas touch.",
                        "The new CEO's restructuring plan was a success, proving he has the Midas touch.")));

        IDIOM_LIST.add(new Idiom(567, 't', "The Whole Nine Yards", "Everything; the entire amount or extent.",
                List.of("She decorated the room for the party: streamers, balloons, food—the whole nine yards.",
                        "He gave the presentation and answered all the questions—the whole nine yards.")));

        IDIOM_LIST.add(new Idiom(568, 't', "Through the Wringer", "To go through a difficult or stressful experience.",
                List.of("The candidate was put through the wringer during the intense interview process.",
                        "After the audit, the department felt like they had been put through the wringer.")));

        IDIOM_LIST.add(new Idiom(569, 't', "Tighten Your Belt", "To reduce spending; to live more frugally.",
                List.of("When the revenue dropped, the company had to tighten its belt.",
                        "We need to tighten our belt for a few months until the debt is paid.")));

        IDIOM_LIST.add(new Idiom(570, 't', "To Beat Around the Bush", "To avoid getting to the point; speaking indirectly.",
                List.of("Stop beating around the bush and tell me the real reason you quit.",
                        "The politician spent ten minutes beating around the bush to avoid answering the tough question.")));

        IDIOM_LIST.add(new Idiom(571, 't', "Too Many Cooks Spoil the Broth", "If too many people are involved in a task, it will be poorly done.",
                List.of("The design failed because there were too many managers giving input; too many cooks spoil the broth.",
                        "We need to delegate clearly to avoid the problem of too many cooks spoiling the broth.")));

        IDIOM_LIST.add(new Idiom(572, 't', "Turn Over a New Leaf", "To change one's behavior or life for the better.",
                List.of("After the New Year, she promised to turn over a new leaf and start exercising.",
                        "He made a sincere effort to turn over a new leaf after the incident.")));

        IDIOM_LIST.add(new Idiom(573, 'u', "Under the Gun", "Under pressure or stress, typically because of an approaching deadline.",
                List.of("We are under the gun to finish this proposal by tomorrow morning.",
                        "The entire factory is under the gun to ship the products on time.")));

        IDIOM_LIST.add(new Idiom(574, 'u', "Up in Arms", "Very angry; protesting vehemently.",
                List.of("The local residents were up in arms about the new tax increase.",
                        "When the park was closed, the community was up in arms.")));

        IDIOM_LIST.add(new Idiom(575, 'w', "Wet Behind the Ears", "Inexperienced, naive, or new to a job.",
                List.of("He's too wet behind the ears to lead a project of this size.",
                        "You can't trust the judgment of someone still wet behind the ears.")));

        IDIOM_LIST.add(new Idiom(576, 'w', "White Elephant", "A possession that is useless, troublesome, or expensive to maintain.",
                List.of("The massive boat they bought became a white elephant due to docking fees.",
                        "That expensive, unused machine is a white elephant.")));

        IDIOM_LIST.add(new Idiom(577, 'w', "Witch Hunt", "An intensive, often paranoid, effort to find and expose disloyal or undesirable people.",
                List.of("The investigation felt more like a witch hunt than a real search for the truth.",
                        "He claimed the inquiry against him was nothing but a political witch hunt.")));

        IDIOM_LIST.add(new Idiom(578, 'w', "Wrap Your Head Around It", "To comprehend something that is complicated or unusual.",
                List.of("It took me a few days to wrap my head around the new company policy.",
                        "I still can't wrap my head around how they built that complex structure.")));

        IDIOM_LIST.add(new Idiom(579, 'z', "Zero In On", "To focus all attention onto a particular target or subject.",
                List.of("The discussion needs to zero in on the core budget issues.",
                        "The sniper zeroed in on the target and took the shot.")));

        IDIOM_LIST.add(new Idiom(580, 'a', "An Axe to Grind", "Having a selfish reason or hidden personal agenda for doing or saying something.",
                List.of("She argued against the motion, but everyone knew she had an axe to grind.",
                        "The harsh criticism suggested the reviewer had an axe to grind.")));

        IDIOM_LIST.add(new Idiom(581, 'b', "Behind the Eight Ball", "In a difficult or disadvantageous position.",
                List.of("After the early failure, the team was immediately behind the eight ball.",
                        "Missing the initial investment deadline put us behind the eight ball.")));

        IDIOM_LIST.add(new Idiom(582, 'b', "Bite Off More Than You Can Chew", "To attempt a task that is too large or difficult to handle.",
                List.of("He agreed to three new projects and immediately realized he had bitten off more than he could chew.",
                        "Don't bite off more than you can chew; focus on one task at a time.")));

        IDIOM_LIST.add(new Idiom(583, 'b', "Black and White", "Clear and definitive; without shades of gray.",
                List.of("The contract must be in black and white before I sign it.",
                        "The issue isn't always black and white; there are complexities.")));

        IDIOM_LIST.add(new Idiom(584, 'b', "Bolt from the Blue", "A sudden, unexpected event.",
                List.of("The company's closure came like a bolt from the blue to all the employees.",
                        "The unexpected visit was a bolt from the blue.")));

        IDIOM_LIST.add(new Idiom(585, 'c', "Cat Got Your Tongue?", "Why are you not speaking? (Often said to someone who is silent when expected to speak).",
                List.of("When the principal asked you a question, cat got your tongue?",
                        "You were so talkative earlier—what is it, cat got your tongue?")));

        IDIOM_LIST.add(new Idiom(586, 'c', "Chalk it Up to Experience", "To consider a failure or loss as a valuable learning experience.",
                List.of("I lost money on the investment, but I'll chalk it up to experience.",
                        "The concert was a disaster, but we'll chalk it up to experience and plan better next time.")));

        IDIOM_LIST.add(new Idiom(587, 'c', "Chip Off the Old Block", "A son or daughter who resembles his or her father or mother.",
                List.of("He's a chip off the old block—just as smart as his dad.",
                        "She followed her mother into law; she's a chip off the old block.")));

        IDIOM_LIST.add(new Idiom(588, 'c', "Clear as a Bell", "Very clear and easy to understand.",
                List.of("The explanation was clear as a bell; I understood everything.",
                        "The music sounded clear as a bell through the new speakers.")));

        IDIOM_LIST.add(new Idiom(589, 'c', "Come Hell or High Water", "No matter what happens; despite any difficulty.",
                List.of("We will get this package delivered on time, come hell or high water.",
                        "I promised I'd be there, come hell or high water.")));

        IDIOM_LIST.add(new Idiom(590, 'd', "Dead Ringer", "A person or thing that is an exact duplicate or look-alike of another.",
                List.of("He's a dead ringer for the famous actor.",
                        "That car is a dead ringer for a classic model, but it's new.")));

        IDIOM_LIST.add(new Idiom(591, 'd', "Drive a Hard Bargain", "To negotiate fiercely and refuse to make concessions.",
                List.of("The buyer drives a hard bargain, rarely agreeing to the asking price.",
                        "Be prepared to drive a hard bargain if you want a good deal.")));

        IDIOM_LIST.add(new Idiom(592, 'd', "Drop the Ball", "To make a mistake, especially by failing to pay attention to a detail or to keep up with an action.",
                List.of("The shipping department dropped the ball and sent the order late.",
                        "We can't afford to drop the ball on client security.")));

        IDIOM_LIST.add(new Idiom(593, 'f', "Feather in Your Cap", "An achievement or something to be proud of.",
                List.of("Getting that endorsement was a real feather in her cap.",
                        "The successful presentation was a feather in the intern's cap.")));

        IDIOM_LIST.add(new Idiom(594, 'f', "Fiddle While Rome Burns", "To focus on trivial matters while ignoring a crisis.",
                List.of("Management spent all week debating minor issues, essentially fiddling while Rome burns.",
                        "The politicians were accused of fiddling while Rome burns.")));

        IDIOM_LIST.add(new Idiom(595, 'f', "Fish Out of Water", "Feeling uncomfortable or awkward in an unfamiliar environment.",
                List.of("As a private citizen at the diplomatic dinner, she felt like a fish out of water.",
                        "He was a musician at the engineering conference, a fish out of water.")));

        IDIOM_LIST.add(new Idiom(596, 'f', "Full of Hot Air", "Talking foolishly or boastfully; unreliable in what one says.",
                List.of("Don't believe his promises; he's full of hot air.",
                        "That consultant is full of hot air and offers no real solutions.")));

        IDIOM_LIST.add(new Idiom(597, 'g', "Get a Second Wind", "A renewed burst of energy or motivation after being tired.",
                List.of("I was tired, but after a short rest, I got a second wind and finished the hike.",
                        "The boxer got a second wind in the final round.")));

        IDIOM_LIST.add(new Idiom(598, 'g', "Go Down in Flames", "To fail dramatically or spectacularly.",
                List.of("Their ambitious startup went down in flames after mismanaging funds.",
                        "The experimental launch went down in flames shortly after takeoff.")));

        IDIOM_LIST.add(new Idiom(599, 'h', "Hands Are Tied", "Unable to help or act because of rules, laws, or circumstances.",
                List.of("The government wants to lower taxes, but their hands are tied by debt.",
                        "I can't override the system; my hands are tied.")));

        IDIOM_LIST.add(new Idiom(600, 'h', "Head Over Heels", "Deeply in love.",
                List.of("He is head over heels in love with his new fiancé.",
                        "They were head over heels for each other from the first date.")));
        IDIOM_LIST.add(new Idiom(601, 'h', "Hear on the Grapevine", "To hear news or information through rumor or gossip.",
                List.of("I heard on the grapevine that the office is closing next month.",
                        "Did you hear about the new manager? I heard it on the grapevine.")));

        IDIOM_LIST.add(new Idiom(602, 'h', "Hit the Books", "To study hard, usually for a test or exam.",
                List.of("I have a big final tomorrow, so I need to hit the books tonight.",
                        "The students hit the books every evening during exam season.")));

        IDIOM_LIST.add(new Idiom(603, 'h', "Hush-Hush", "Secret or confidential.",
                List.of("The details of the merger are all very hush-hush right now.",
                        "They kept the new product development hush-hush until the launch.")));

        IDIOM_LIST.add(new Idiom(604, 'i', "In a Nutshell", "To summarize, briefly and concisely.",
                List.of("In a nutshell, the meeting was a complete waste of time.",
                        "The book is about a simple love story; that's it in a nutshell.")));

        IDIOM_LIST.add(new Idiom(605, 'i', "In Full Swing", "At the height of activity; operating at its maximum level.",
                List.of("The carnival was in full swing by late afternoon.",
                        "The construction work is now in full swing, with workers everywhere.")));

        IDIOM_LIST.add(new Idiom(606, 'i', "In the Dark", "Uninformed; unaware of essential facts.",
                List.of("The board made the decision and left the rest of us completely in the dark.",
                        "I was in the dark about the surprise party until the last minute.")));

        IDIOM_LIST.add(new Idiom(607, 'i', "In the Loop", "Part of a group that is kept informed about something.",
                List.of("Make sure you keep me in the loop regarding any budget changes.",
                        "The manager ensures that all team members are in the loop on project updates.")));

        IDIOM_LIST.add(new Idiom(608, 'i', "In the Red", "Losing money; operating at a loss.",
                List.of("The company has been operating in the red for three quarters.",
                        "We need to cut costs to get out of the red.")));

        IDIOM_LIST.add(new Idiom(609, 'j', "Jumping for Joy", "Being extremely happy; thrilled.",
                List.of("When she heard she got the job, she was literally jumping for joy.",
                        "The whole town was jumping for joy after the team won the championship.")));

        IDIOM_LIST.add(new Idiom(610, 'j', "Jury Is Still Out", "A decision has not yet been made; the matter is still uncertain.",
                List.of("The jury is still out on whether the new product will be a success.",
                        "They've made promises, but the jury is still out on their commitment.")));

        IDIOM_LIST.add(new Idiom(611, 'k', "Keep an Eye On", "To watch carefully; to monitor or supervise.",
                List.of("Can you keep an eye on the kids while I take a quick call?",
                        "The security guard keeps an eye on the entrance at all times.")));

        IDIOM_LIST.add(new Idiom(612, 'k', "Keep a Low Profile", "To avoid drawing attention to oneself.",
                List.of("The celebrity decided to keep a low profile after the scandal.",
                        "Until the investigation is over, you should keep a low profile.")));

        IDIOM_LIST.add(new Idiom(613, 'k', "Keep Tabs On", "To monitor or keep track of someone or something.",
                List.of("The teacher keeps tabs on the students who struggle with homework.",
                        "I keep tabs on the competitor's prices by checking their website daily.")));

        IDIOM_LIST.add(new Idiom(614, 'k', "Kick the Bucket", "To die (informal).",
                List.of("The old lawnmower finally kicked the bucket after twenty years.",
                        "My grandpa lived a long life before he finally kicked the bucket.")));

        IDIOM_LIST.add(new Idiom(615, 'l', "Last Resort", "A final option when all others have failed.",
                List.of("Calling the emergency number was their last resort.",
                        "We'll use the reserve funds as a last resort.")));

        IDIOM_LIST.add(new Idiom(616, 'l', "Lend a Hand", "To help someone with a task.",
                List.of("Could you lend a hand moving this heavy sofa?",
                        "I always try to lend a hand to my neighbors when they need it.")));

        IDIOM_LIST.add(new Idiom(617, 'l', "Let Off the Hook", "To allow someone to escape punishment or responsibility.",
                List.of("The judge let the first-time offender off the hook with a warning.",
                        "I let my brother off the hook for washing the dishes tonight.")));

        IDIOM_LIST.add(new Idiom(618, 'l', "Lose Your Marbles", "To go crazy; to become mentally unstable.",
                List.of("He’s been working non-stop for weeks—I think he's losing his marbles.",
                        "Did you seriously wear two different shoes? Have you lost your marbles?")));

        IDIOM_LIST.add(new Idiom(619, 'm', "Mad as a Hatter", "Completely crazy or eccentric.",
                List.of("He wears socks with sandals and talks to squirrels; he's mad as a hatter.",
                        "The inventor's ideas seemed mad as a hatter until one of them actually worked.")));

        IDIOM_LIST.add(new Idiom(620, 'm', "Make a Mountain Out of a Molehill", "To exaggerate a minor problem, making it seem much more serious than it is.",
                List.of("It was just a small scratch; don't make a mountain out of a molehill.",
                        "He tends to make a mountain out of a molehill over trivial matters.")));

        IDIOM_LIST.add(new Idiom(621, 'm', "Move Heaven and Earth", "To do everything possible to achieve a goal.",
                List.of("She promised to move heaven and earth to get the project finished on time.",
                        "He would move heaven and earth for his family's safety.")));

        IDIOM_LIST.add(new Idiom(622, 'm', "Muddy the Waters", "To make a situation or issue unclear or confusing.",
                List.of("The contradictory reports only served to muddy the waters on the investigation.",
                        "His vague explanation just muddied the waters for the students.")));

        IDIOM_LIST.add(new Idiom(623, 'n', "Neck and Neck", "Tied in a race or competition.",
                List.of("The two leading candidates are neck and neck in the polls.",
                        "The marathon runners were neck and neck right up to the finish line.")));

        IDIOM_LIST.add(new Idiom(624, 'n', "Nest Egg", "A sum of money saved for a specific purpose, often for retirement.",
                List.of("They are building a nest egg to fund their children's college education.",
                        "His retirement nest egg is substantial after decades of saving.")));

        IDIOM_LIST.add(new Idiom(625, 'n', "New Lease on Life", "A renewed energy or interest in life; a fresh start.",
                List.of("After his recovery, he felt he had a new lease on life.",
                        "The renovation gave the old building a new lease on life.")));

        IDIOM_LIST.add(new Idiom(626, 'n', "No-Brainer", "A decision or choice that is so obvious that it requires little or no thought.",
                List.of("Accepting that job offer was a complete no-brainer.",
                        "Buying the discounted tickets was a no-brainer.")));

        IDIOM_LIST.add(new Idiom(627, 'n', "Not a Spark of Decency", "Having no morality or kindness whatsoever.",
                List.of("That landlord raised the rent on the struggling family; he doesn't have a spark of decency.",
                        "To cheat a friend out of money shows not a spark of decency.")));

        IDIOM_LIST.add(new Idiom(628, 'o', "Off the Record", "Not intended to be made public or quoted officially.",
                List.of("The mayor made a few comments off the record after the press conference.",
                        "What I'm telling you is off the record, so don't tell anyone.")));

        IDIOM_LIST.add(new Idiom(629, 'o', "On a Roll", "Experiencing a prolonged period of success or good luck.",
                List.of("The team is on a roll, winning five games in a row.",
                        "She's been on a roll with her investments lately.")));

        IDIOM_LIST.add(new Idiom(630, 'o', "On the Wagon", "Abstaining from drinking alcohol.",
                List.of("He hasn't had a drink in a year; he's been on the wagon.",
                        "I can't join you for a glass of wine; I'm on the wagon for a month.")));

        IDIOM_LIST.add(new Idiom(631, 'p', "Pad the Bill", "To add extra, unnecessary charges to a bill or expense report.",
                List.of("The mechanic was caught padding the bill with unnecessary labor hours.",
                        "Be careful when reviewing their invoices, they often try to pad the bill.")));

        IDIOM_LIST.add(new Idiom(632, 'p', "Par for the Course", "What is expected or normal for a particular situation or activity.",
                List.of("Long lines at the DMV are just par for the course.",
                        "The technical glitches were par for the course with that old software.")));

        IDIOM_LIST.add(new Idiom(633, 'p', "Pass With Flying Colors", "To pass a test, examination, or course easily and with a very high score.",
                List.of("She studied all night and passed her final exam with flying colors.",
                        "The team completed the safety inspection with flying colors.")));

        IDIOM_LIST.add(new Idiom(634, 'p', "Poker Face", "An expressionless face, revealing no emotion, that prevents others from knowing what one is thinking.",
                List.of("She maintained a perfect poker face during the high-stakes negotiation.",
                        "It’s hard to read his intentions; he always has a poker face.")));

        IDIOM_LIST.add(new Idiom(635, 'p', "Practice Makes Perfect", "Regular exercise of an activity or skill is the way to become proficient in it.",
                List.of("Don't worry if you fail the first time; practice makes perfect.",
                        "She continues to rehearse the song, knowing that practice makes perfect.")));

        IDIOM_LIST.add(new Idiom(636, 'q', "Quick Fix", "A temporary and easy solution that avoids addressing the underlying problem.",
                List.of("We need a permanent solution, not a quick fix.",
                        "Taping the leak is just a quick fix; we need a new pipe.")));

        IDIOM_LIST.add(new Idiom(637, 'r', "Raining Cats and Dogs", "Raining extremely heavily.",
                List.of("We couldn't go for a walk because it was raining cats and dogs.",
                        "Take an umbrella; it's raining cats and dogs outside.")));

        IDIOM_LIST.add(new Idiom(638, 'r', "Read the Riot Act", "To issue a stern warning with clear consequences for misbehavior.",
                List.of("The coach read the riot act to the team after their dismal performance.",
                        "My mother read me the riot act after I broke curfew.")));

        IDIOM_LIST.add(new Idiom(639, 's', "Save Your Breath", "To advise someone that their efforts to convince or argue are futile.",
                List.of("Save your breath; I've already made up my mind.",
                        "He won't change his opinion, so save your breath.")));

        IDIOM_LIST.add(new Idiom(640, 's', "Sell Yourself Short", "To underestimate one's own worth or abilities; to accept less than one deserves.",
                List.of("Don't sell yourself short in the salary negotiation; you deserve that raise.",
                        "She is so talented, but she often sells herself short by being too modest.")));

        IDIOM_LIST.add(new Idiom(641, 's', "Shape Up or Ship Out", "Either improve one's behavior or performance or leave the job/situation.",
                List.of("The boss warned the employee to shape up or ship out after repeated mistakes.",
                        "It's time for the whole team to shape up or ship out.")));

        IDIOM_LIST.add(new Idiom(642, 's', "Shoot Yourself in the Foot", "To hurt your own cause or interest unintentionally.",
                List.of("He shot himself in the foot by bragging about his salary during negotiations.",
                        "By rejecting the easy option, we might shoot ourselves in the foot.")));

        IDIOM_LIST.add(new Idiom(643, 's', "Sight for Sore Eyes", "A person or thing that one is extremely happy or relieved to see.",
                List.of("After a long journey, the hotel room was a sight for sore eyes.",
                        "My daughter was a sight for sore eyes when she finally returned home.")));

        IDIOM_LIST.add(new Idiom(644, 's', "Silver Lining", "A sign of hope in an unfortunate or gloomy situation.",
                List.of("The long-term silver lining of the disaster was the community coming together.",
                        "Even in a tough year, there's always a silver lining if you look for it.")));

        IDIOM_LIST.add(new Idiom(645, 's', "Snug as a Bug in a Rug", "Very comfortable and cozy.",
                List.of("The baby looked snug as a bug in a rug wrapped in her blanket.",
                        "We were all snug as a bug in a rug by the fireplace.")));

        IDIOM_LIST.add(new Idiom(646, 't', "Take the Edge Off", "To slightly moderate or lessen the intensity of something, often pain, craving, or tension.",
                List.of("A warm bath helped take the edge off her stress.",
                        "He took a small drink to take the edge off his anxiety before the presentation.")));

        IDIOM_LIST.add(new Idiom(647, 't', "Take the Heat", "To endure the criticism or blame for something.",
                List.of("Someone has to take the heat for the failure of the campaign.",
                        "The captain had to take the heat from the fans after the loss.")));

        IDIOM_LIST.add(new Idiom(648, 't', "Taste of Your Own Medicine", "To experience the same unpleasantness or bad treatment that you have given to others.",
                List.of("After always making fun of others, he finally got a taste of his own medicine.",
                        "It's about time she got a taste of her own medicine for being so rude.")));

        IDIOM_LIST.add(new Idiom(649, 't', "The Last Hurdle", "The final difficulty or obstacle in a process.",
                List.of("The presentation is finished; all we have left is the last hurdle of client approval.",
                        "Getting the final signature was the last hurdle for the project.")));

        IDIOM_LIST.add(new Idiom(650, 't', "The Last Straw", "The final problem in a series of problems that causes someone to lose patience.",
                List.of("His rude comment was the last straw; I decided to leave the meeting.",
                        "After endless delays, the price increase was the last straw for the customer.")));
        IDIOM_LIST.add(new Idiom(651, 't', "Through Thick and Thin", "Through good times and bad times; in spite of all difficulties.",
                List.of("A true friend stays with you through thick and thin.",
                        "The company has managed to survive through thick and thin over the past century.")));

        IDIOM_LIST.add(new Idiom(652, 't', "Tighten Your Belt", "To reduce spending; to live more frugally.",
                List.of("With the economy slowing, everyone has to tighten their belt.",
                        "We need to tighten our belt until the next paycheck arrives.")));

        IDIOM_LIST.add(new Idiom(653, 't', "Touch Base", "To briefly make contact or check in with someone.",
                List.of("I'll touch base with you tomorrow morning to discuss the proposal.",
                        "Let's touch base with the client before the end of the week.")));

        IDIOM_LIST.add(new Idiom(654, 'u', "Under the Wire", "At the last possible moment; barely on time.",
                List.of("We submitted the grant proposal right under the wire.",
                        "She made it to the appointment under the wire.")));

        IDIOM_LIST.add(new Idiom(655, 'w', "Walk a Tightrope", "To be in a precarious or dangerous situation that requires careful balancing or planning.",
                List.of("The government is walking a tightrope between inflation and recession.",
                        "He is walking a tightrope between pleasing his boss and his team.")));

        IDIOM_LIST.add(new Idiom(656, 'w', "Warts and All", "Including all faults or imperfections.",
                List.of("He described the company's history, warts and all, during the interview.",
                        "I love my hometown, warts and all.")));

        IDIOM_LIST.add(new Idiom(657, 'w', "Wear Out One's Welcome", "To stay so long that one is no longer welcome.",
                List.of("It was time to leave; I didn't want to wear out my welcome.",
                        "The neighbors visit so often that they are wearing out their welcome.")));

        IDIOM_LIST.add(new Idiom(658, 'w', "When in Rome, Do as the Romans Do", "When you are in a foreign place or new situation, you should follow the customs of the people there.",
                List.of("I don't usually eat such late dinners, but when in Rome, do as the Romans do.",
                        "The host convinced her to try the local dish, saying, 'When in Rome...'")));

        IDIOM_LIST.add(new Idiom(659, 'y', "You Can Say That Again", "A phrase used to express strong agreement with something someone has just said.",
                List.of("A: This weather is absolutely miserable. B: You can say that again!",
                        "A: That was the best concert ever. B: You can say that again!")));

        IDIOM_LIST.add(new Idiom(660, 'z', "Zip Your Lip", "To stop talking; to keep quiet or a secret.",
                List.of("I have told you the secret, now zip your lip and don't tell anyone.",
                        "The spy was instructed to zip his lip and reveal nothing.")));

        IDIOM_LIST.add(new Idiom(661, 'a', "An Arm and a Leg", "Very expensive or costly.",
                List.of("That new phone costs an arm and a leg.",
                        "The renovation costs an arm and a leg in this city.")));

        IDIOM_LIST.add(new Idiom(662, 'a', "Apple of My Eye", "The person or thing one loves most; a favorite.",
                List.of("His youngest daughter is the apple of his eye.",
                        "That classic car is the apple of my eye.")));

        IDIOM_LIST.add(new Idiom(663, 'a', "Around the Clock", "All day and all night; continuously.",
                List.of("The construction crew worked around the clock to finish the bridge.",
                        "The hospital is staffed around the clock, seven days a week.")));

        IDIOM_LIST.add(new Idiom(664, 'b', "Back Seat Driver", "A passenger who constantly gives unwanted advice on how to drive.",
                List.of("My brother is such a back seat driver, constantly giving directions.",
                        "Stop being a back seat driver; I know how to handle this project.")));

        IDIOM_LIST.add(new Idiom(665, 'b', "Back to the Drawing Board", "To start a task or project over again from the beginning, usually after a previous attempt failed.",
                List.of("The experiment failed, so we are back to the drawing board.",
                        "The proposal was rejected, so we had to go back to the drawing board.")));

        IDIOM_LIST.add(new Idiom(666, 'b', "Bark Worse Than One's Bite", "To be less unpleasant or aggressive than one's words or demeanor suggest.",
                List.of("Don't worry about the teacher; his bark is worse than his bite.",
                        "The manager talks tough, but his bark is worse than his bite.")));

        IDIOM_LIST.add(new Idiom(667, 'b', "Batting a Thousand", "Having a perfect record; succeeding at everything.",
                List.of("The salesperson has been batting a thousand this month, closing every deal.",
                        "The new software is batting a thousand, with zero reported bugs.")));

        IDIOM_LIST.add(new Idiom(668, 'b', "Beauty is in the Eye of the Beholder", "What one person finds beautiful, another may not.",
                List.of("I think the dress is hideous, but beauty is in the eye of the beholder.",
                        "Don't let criticism bother you; beauty is in the eye of the beholder.")));

        IDIOM_LIST.add(new Idiom(669, 'b', "Bend Over Backwards", "To make every effort to help someone; to be extremely accommodating.",
                List.of("The staff bent over backwards to ensure the client was happy.",
                        "He will bend over backwards to avoid conflict.")));

        IDIOM_LIST.add(new Idiom(670, 'b', "Beside the Point", "Irrelevant; not important to the matter at hand.",
                List.of("Whether you like the new uniform is beside the point; it's required.",
                        "His feelings, while noted, are beside the point in this legal matter.")));

        IDIOM_LIST.add(new Idiom(671, 'b', "Big Cheese", "An important, influential, or powerful person.",
                List.of("The big cheese himself is coming to inspect the office tomorrow.",
                        "She is the big cheese of the whole advertising campaign.")));

        IDIOM_LIST.add(new Idiom(672, 'b', "Bird's-Eye View", "A view from a high angle, giving a comprehensive overall look.",
                List.of("We got a bird's-eye view of the city from the observation deck.",
                        "The drone footage provided a good bird's-eye view of the stadium.")));

        IDIOM_LIST.add(new Idiom(673, 'b', "Black Sheep", "A member of a group or family who is regarded as a disgrace to it.",
                List.of("He was always the black sheep of the family for pursuing a career in acting.",
                        "The disruptive employee became the black sheep of the department.")));

        IDIOM_LIST.add(new Idiom(674, 'b', "Blow Off Steam", "To express strong feelings or energy in order to relieve stress.",
                List.of("After a difficult week, he needed to go running to blow off steam.",
                        "Let him shout for a minute; he just needs to blow off steam.")));

        IDIOM_LIST.add(new Idiom(675, 'b', "Blowing Smoke", "Exaggerating or boasting; saying things that are not true to impress someone.",
                List.of("He keeps talking about his past deals, but I think he's just blowing smoke.",
                        "Don't worry about his threats; he's just blowing smoke.")));

        IDIOM_LIST.add(new Idiom(676, 'b', "Bottom Line", "The most important fact or consideration; the final result.",
                List.of("The bottom line is that we need to increase productivity by ten percent.",
                        "I don't care about the excuses; tell me the bottom line.")));

        IDIOM_LIST.add(new Idiom(677, 'c', "Calm Before the Storm", "A period of unusual quiet or stability preceding a time of great activity, trouble, or excitement.",
                List.of("The quiet of the morning was the calm before the storm of the holiday rush.",
                        "Enjoy the calm before the storm of the audit.")));

        IDIOM_LIST.add(new Idiom(678, 'c', "Carry a Torch", "To maintain an unrequited or hopeless love for someone.",
                List.of("He still carries a torch for his ex-girlfriend from college.",
                        "She secretly carries a torch for the movie star.")));

        IDIOM_LIST.add(new Idiom(679, 'c', "Caught Red-Handed", "Discovered in the act of doing something wrong.",
                List.of("The child was caught red-handed drawing on the walls with a marker.",
                        "The thief was caught red-handed stealing the jewelry.")));

        IDIOM_LIST.add(new Idiom(680, 'c', "Change of Heart", "A change in one's opinion or attitude.",
                List.of("After seeing the house, she had a change of heart and decided to buy it.",
                        "The board had a change of heart and reversed the policy decision.")));

        IDIOM_LIST.add(new Idiom(681, 'c', "Chew the Fat", "To chat idly or generally waste time talking.",
                List.of("We spent the evening just sitting on the porch and chewing the fat.",
                        "The neighbors meet every morning to chew the fat over coffee.")));

        IDIOM_LIST.add(new Idiom(682, 'c', "Close But No Cigar", "Almost succeeding, but not quite.",
                List.of("He got the puzzle mostly right, but not completely. Close but no cigar!",
                        "They came close to winning the bid, but it was close but no cigar.")));

        IDIOM_LIST.add(new Idiom(683, 'c', "Cold Turkey", "Abruptly and completely stopping an addictive or habitual behavior.",
                List.of("He quit smoking cold turkey last year and hasn't looked back.",
                        "Stopping the project cold turkey would waste all our investment.")));

        IDIOM_LIST.add(new Idiom(684, 'c', "Come Clean", "To confess or reveal the truth about something.",
                List.of("The witness finally came clean about what he saw that night.",
                        "It’s better to come clean now about the mistake.")));

        IDIOM_LIST.add(new Idiom(685, 'c', "Couch Potato", "A person who spends a lot of time sitting or lying down, watching television, etc.",
                List.of("Since retiring, my father has become a total couch potato.",
                        "I felt like a couch potato after watching movies all weekend.")));

        IDIOM_LIST.add(new Idiom(686, 'c', "Cream of the Crop", "The best of a group; the highest quality.",
                List.of("Only the cream of the crop were invited to the exclusive training program.",
                        "This university accepts only the cream of the crop of high school students.")));

        IDIOM_LIST.add(new Idiom(687, 'c', "Cut to the Chase", "To get to the point without wasting time on preliminaries.",
                List.of("Stop all the small talk and just cut to the chase—what do you want?",
                        "The chairman asked the presenter to cut to the chase and present the key findings.")));

        IDIOM_LIST.add(new Idiom(688, 'd', "Dark Horse", "A person or thing that was previously little known but unexpectedly wins or succeeds.",
                List.of("The relatively unknown politician was the dark horse of the election.",
                        "The quiet student turned out to be the dark horse in the chess tournament.")));

        IDIOM_LIST.add(new Idiom(689, 'd', "Daylight Robbery", "A price that is exorbitant or outrageously expensive.",
                List.of("The cost of a small bottle of water at the airport is daylight robbery.",
                        "Charging that much for a simple repair is daylight robbery.")));

        IDIOM_LIST.add(new Idiom(690, 'd', "Dead End", "A situation from which no progress can be made.",
                List.of("The investigation reached a dead end when the key witness disappeared.",
                        "After three years, his career felt like it had hit a dead end.")));

        IDIOM_LIST.add(new Idiom(691, 'd', "Die-Hard", "Very devoted and loyal to a particular team, group, or cause.",
                List.of("He is a die-hard fan of the local football club.",
                        "They are die-hard believers in their controversial theory.")));

        IDIOM_LIST.add(new Idiom(692, 'd', "Dog-Eat-Dog", "A fiercely competitive situation where people will do anything to succeed.",
                List.of("The job market right now is dog-eat-dog.",
                        "It's a dog-eat-dog world in high-stakes finance.")));

        IDIOM_LIST.add(new Idiom(693, 'd', "Donkey's Years", "A very long time.",
                List.of("I haven't seen you in donkey's years!",
                        "It took donkey's years to get the approval needed for the project.")));

        IDIOM_LIST.add(new Idiom(694, 'd', "Down the Drain", "Wasted or lost completely.",
                List.of("All that money spent on the failed project went straight down the drain.",
                        "If we don't finish this, all our hard work will go down the drain.")));

        IDIOM_LIST.add(new Idiom(695, 'e', "Eat Crow", "To be forced to acknowledge that one was wrong or defeated; to admit a humiliating mistake.",
                List.of("After loudly predicting failure, he had to eat crow when the product succeeded.",
                        "The expert had to eat crow when his forecast proved incorrect.")));

        IDIOM_LIST.add(new Idiom(696, 'e', "Every Trick in the Book", "To try every possible method or strategy.",
                List.of("He used every trick in the book to try and win the game.",
                        "They tried every trick in the book to get the machine working again.")));

        IDIOM_LIST.add(new Idiom(697, 'f', "Fair and Square", "Honestly and without cheating.",
                List.of("The team won the championship fair and square.",
                        "She earned the promotion fair and square.")));

        IDIOM_LIST.add(new Idiom(698, 'f', "Fair-Weather Friend", "A person who is only your friend when things are going well and abandons you during difficult times.",
                List.of("He disappeared as soon as I lost my job; he was just a fair-weather friend.",
                        "Don't rely on him; he's a fair-weather friend at best.")));

        IDIOM_LIST.add(new Idiom(699, 'f', "Flesh and Blood", "One's own family or close relatives.",
                List.of("He had to help her; she is his own flesh and blood.",
                        "It's hard to turn away from your own flesh and blood.")));

        IDIOM_LIST.add(new Idiom(700, 'f', "Fork in the Road", "A point at which a difficult choice has to be made.",
                List.of("After graduation, she reached a fork in the road regarding her career path.",
                        "The business is at a fork in the road: expand or stay small.")));
        IDIOM_LIST.add(new Idiom(701, 'g', "Get Away with Murder", "To avoid punishment for doing something wrong or illegal.",
                List.of("The wealthy businessman seems to get away with murder because of his connections.",
                        "That teacher lets the students get away with murder.")));

        IDIOM_LIST.add(new Idiom(702, 'g', "Get the Lowdown", "To get the true or essential information about something.",
                List.of("I called my friend to get the lowdown on the office reorganization.",
                        "Let's meet up and I'll give you the lowdown on the new policy.")));

        IDIOM_LIST.add(new Idiom(703, 'g', "Get the Wrong End of the Stick", "To completely misunderstand a situation or a statement.",
                List.of("I think you've got the wrong end of the stick; I didn't mean that at all.",
                        "The media got the wrong end of the stick regarding the mayor's speech.")));

        IDIOM_LIST.add(new Idiom(704, 'g', "Give Someone the Cold Shoulder", "To intentionally ignore someone or treat them in an unfriendly way.",
                List.of("After the disagreement, she gave him the cold shoulder for a week.",
                        "I said hello, but he gave me the cold shoulder and walked away.")));

        IDIOM_LIST.add(new Idiom(705, 'g', "Go Against the Grain", "To do something contrary to the conventional way.",
                List.of("His innovative ideas always go against the grain of traditional thinking.",
                        "She likes to go against the grain and challenge popular opinion.")));

        IDIOM_LIST.add(new Idiom(706, 'g', "Go Down in Flames", "To fail dramatically or spectacularly.",
                List.of("Their new marketing campaign went down in flames after the public backlash.",
                        "The business idea went down in flames when the main investor pulled out.")));

        IDIOM_LIST.add(new Idiom(707, 'h', "Hanging Out to Dry", "Abandoning or neglecting someone in a difficult situation.",
                List.of("When the scandal broke, his former colleagues left him hanging out to dry.",
                        "I felt like my business partner hung me out to dry by quitting unexpectedly.")));

        IDIOM_LIST.add(new Idiom(708, 'h', "Hard and Fast", "Strictly established or enforced; not easily changed.",
                List.of("There are no hard and fast rules about how to write a good essay.",
                        "We need a hard and fast deadline for the submission.")));

        IDIOM_LIST.add(new Idiom(709, 'h', "Have a Chip on One's Shoulder", "To hold a grudge or have an aggressive attitude because of a past slight or perceived inferiority.",
                List.of("He walks around with a chip on his shoulder ever since he was fired.",
                        "She has a chip on her shoulder about not getting into her first-choice university.")));

        IDIOM_LIST.add(new Idiom(710, 'h', "Have One's Cake and Eat It Too", "To want or try to have two desirable things that are impossible to have simultaneously.",
                List.of("She wants a promotion without taking on extra work; she wants to have her cake and eat it too.",
                        "You can't have your cake and eat it too in this investment.")));

        IDIOM_LIST.add(new Idiom(711, 'h', "Hit the Jackpot", "To achieve great success, often unexpectedly.",
                List.of("He hit the jackpot with his first investment in cryptocurrency.",
                        "We hit the jackpot when we found that perfect house at a low price.")));

        IDIOM_LIST.add(new Idiom(712, 'i', "In the Doghouse", "In disgrace or in trouble.",
                List.of("He forgot his wife's birthday and has been in the doghouse all week.",
                        "The player is in the doghouse with the coach after missing practice.")));

        IDIOM_LIST.add(new Idiom(713, 'i', "In the Driver's Seat", "In control of a situation.",
                List.of("Since the promotion, she's been in the driver's seat for all strategic decisions.",
                        "It’s good to finally be in the driver's seat after years of following orders.")));

        IDIOM_LIST.add(new Idiom(714, 'i', "In the Red", "Losing money; operating at a loss.",
                List.of("The small business has been operating in the red for months.",
                        "We need to cut costs to get out of the red before the end of the year.")));

        IDIOM_LIST.add(new Idiom(715, 'j', "Jump Down Someone's Throat", "To criticize or speak angrily to someone, often without provocation.",
                List.of("I just asked a simple question, but he immediately jumped down my throat.",
                        "Don't jump down his throat; he didn't mean any harm.")));

        IDIOM_LIST.add(new Idiom(716, 'j', "Jump the Shark", "A point at which a series, show, or campaign has passed its peak and begun a decline in quality or popularity.",
                List.of("Fans agree that the show officially jumped the shark after the main character left.",
                        "The brand's advertising jumped the shark with that ridiculous commercial.")));

        IDIOM_LIST.add(new Idiom(717, 'k', "Keep a Straight Face", "To manage to look serious and avoid laughing.",
                List.of("The joke was so funny it was hard to keep a straight face.",
                        "She tried to keep a straight face while telling the ridiculous story.")));

        IDIOM_LIST.add(new Idiom(718, 'k', "Knock On Wood", "Used to express hope that a good thing will continue or that a bad thing will not happen.",
                List.of("My car hasn't broken down all year, knock on wood.",
                        "The business has been successful so far, knock on wood.")));

        IDIOM_LIST.add(new Idiom(719, 'k', "Knock Your Socks Off", "To impress or excite someone greatly.",
                List.of("Wait until you try this new recipe; it's going to knock your socks off.",
                        "The concert was amazing; the performance knocked my socks off.")));

        IDIOM_LIST.add(new Idiom(720, 'l', "Lend an Ear", "To listen sympathetically and carefully to someone.",
                List.of("I was having a rough day, and my friend was kind enough to lend an ear.",
                        "If you need to talk, I'm here to lend an ear.")));

        IDIOM_LIST.add(new Idiom(721, 'l', "Light at the End of the Tunnel", "A sign that a difficult period is almost over.",
                List.of("After months of hard work, we can finally see the light at the end of the tunnel.",
                        "The successful test offered a light at the end of the tunnel for the researchers.")));

        IDIOM_LIST.add(new Idiom(722, 'l', "Lose Your Touch", "To no longer be able to do something skillfully or effectively as one could before.",
                List.of("He used to be a great salesman, but lately, he seems to have lost his touch.",
                        "I haven't played the piano in years; I've definitely lost my touch.")));

        IDIOM_LIST.add(new Idiom(723, 'l', "Long Shot", "An attempt or venture that has only a slight chance of succeeding.",
                List.of("Applying for that job was a long shot, but she got an interview.",
                        "It was a long shot, but their risky strategy paid off.")));

        IDIOM_LIST.add(new Idiom(724, 'm', "Make Ends Meet", "To earn just enough money to live on.",
                List.of("After losing his job, he struggled to make ends meet.",
                        "Many students work part-time just to make ends meet.")));

        IDIOM_LIST.add(new Idiom(725, 'm', "Make Light of", "To treat something as unimportant or trivial, especially when it is serious.",
                List.of("He tried to make light of the accident to reassure the others.",
                        "Don't make light of her achievements; they took a lot of hard work.")));

        IDIOM_LIST.add(new Idiom(726, 'm', "Money Talks", "Wealth gives a person or organization power and influence.",
                List.of("They got the prime location because, in this town, money talks.",
                        "It's unfair, but money talks when it comes to getting special treatment.")));

        IDIOM_LIST.add(new Idiom(727, 'n', "No Dice", "An emphatic refusal; no way.",
                List.of("I asked if I could leave early, but the boss said no dice.",
                        "We tried to get the exclusive contract, but it was no dice.")));

        IDIOM_LIST.add(new Idiom(728, 'n', "No Pain, No Gain", "Suffering or effort is necessary to achieve something worthwhile.",
                List.of("You'll never get strong if you don't push yourself—no pain, no gain!",
                        "Waking up early to study is hard, but no pain, no gain.")));

        IDIOM_LIST.add(new Idiom(729, 'o', "Off the Cuff", "Spoken or done without preparation; extemporaneously.",
                List.of("His speech was completely off the cuff, yet very engaging.",
                        "That remark was off the cuff; I didn't mean to offend anyone.")));

        IDIOM_LIST.add(new Idiom(730, 'o', "On Cloud Nine", "Extremely happy; ecstatic.",
                List.of("She's been on cloud nine ever since she won the competition.",
                        "When they announced the new baby, the whole family was on cloud nine.")));

        IDIOM_LIST.add(new Idiom(731, 'o', "Once and For All", "Finally and definitively.",
                List.of("It's time to settle this argument once and for all.",
                        "She decided to clean her garage once and for all.")));

        IDIOM_LIST.add(new Idiom(732, 'o', "Open Book", "Someone or something that is easy to understand and keeps no secrets.",
                List.of("He's an open book; you never have to guess what he's thinking.",
                        "The family's history became an open book after the biography was published.")));

        IDIOM_LIST.add(new Idiom(733, 'p', "Pass the Torch", "To hand down a responsibility or knowledge to the next generation or successor.",
                List.of("The CEO decided it was time to pass the torch to his younger vice president.",
                        "The retiring teacher passed the torch of the debate club to a new mentor.")));

        IDIOM_LIST.add(new Idiom(734, 'p', "Picture Paints a Thousand Words", "A visual image conveys a concept or idea more effectively than a description does.",
                List.of("Instead of writing a long explanation, just send them the chart; a picture paints a thousand words.",
                        "The architect realized a picture paints a thousand words when showing the design.")));

        IDIOM_LIST.add(new Idiom(735, 'p', "Play by the Ear", "To improvise and decide on a course of action as one goes along.",
                List.of("We don't have a strict schedule; we'll just play it by the ear.",
                        "We didn't plan the exact details of the trip; we decided to play it by the ear.")));

        IDIOM_LIST.add(new Idiom(736, 'p', "Put the Cart Before the Horse", "To do things in the wrong order.",
                List.of("You are putting the cart before the horse by buying furniture before finding an apartment.",
                        "Trying to celebrate before winning is putting the cart before the horse.")));

        IDIOM_LIST.add(new Idiom(737, 'r', "Recharge One's Batteries", "To rest and regain energy.",
                List.of("I'm taking a week off work to recharge my batteries.",
                        "A short nap is all I need to recharge my batteries.")));

        IDIOM_LIST.add(new Idiom(738, 'r', "Red Tape", "Excessive official rules and procedures that create delays and difficulty.",
                List.of("We spent weeks cutting through the red tape just to get the permit.",
                        "The company is notorious for its bureaucratic red tape.")));

        IDIOM_LIST.add(new Idiom(739, 's', "Safe Bet", "Something that is almost certain to happen; a sure thing.",
                List.of("It's a safe bet that the new film will be a box office hit.",
                        "I'd say it's a safe bet that the meeting will run late.")));

        IDIOM_LIST.add(new Idiom(740, 's', "Sell Like Hotcakes", "To be sold quickly and in large quantities.",
                List.of("The new game console is selling like hotcakes this holiday season.",
                        "The tickets to the concert sold like hotcakes within minutes of going on sale.")));

        IDIOM_LIST.add(new Idiom(741, 's', "Shoot from the Hip", "To speak or act spontaneously, without thinking first.",
                List.of("His ideas are often good, but he tends to shoot from the hip without doing research.",
                        "The politician regretted shooting from the hip during the interview.")));

        IDIOM_LIST.add(new Idiom(742, 's', "Slow and Steady Wins the Race", "A proverb meaning that reliable effort over a long time is better than a quick burst of energy.",
                List.of("Don't rush the project; slow and steady wins the race.",
                        "He consistently practiced small amounts, proving that slow and steady wins the race.")));

        IDIOM_LIST.add(new Idiom(743, 's', "Smell a Rat", "To suspect that something is wrong or dishonest.",
                List.of("When the accountant suddenly resigned, the owner started to smell a rat.",
                        "I don't trust the dealer's story; I smell a rat.")));

        IDIOM_LIST.add(new Idiom(744, 's', "Square Peg in a Round Hole", "A person who is clearly unsuited to the situation or job they are in.",
                List.of("He's a creative artist stuck in a bureaucratic job; he's a square peg in a round hole.",
                        "Trying to force that solution onto the problem is like putting a square peg in a round hole.")));

        IDIOM_LIST.add(new Idiom(745, 's', "Stand One's Ground", "To maintain one's position or opinion despite opposition or pressure.",
                List.of("The witness stood her ground under intense questioning.",
                        "It takes courage to stand your ground against popular opinion.")));

        IDIOM_LIST.add(new Idiom(746, 't', "The Last Hurdle", "The final difficulty or obstacle in a process.",
                List.of("The presentation is finished; all we have left is the last hurdle of client approval.",
                        "Getting the final signature was the last hurdle for the project.")));

        IDIOM_LIST.add(new Idiom(747, 't', "Tighten Your Belt", "To reduce spending; to live more frugally.",
                List.of("With the economy slowing, everyone has to tighten their belt.",
                        "We need to tighten our belt until the next paycheck arrives.")));

        IDIOM_LIST.add(new Idiom(748, 't', "Touch Base", "To briefly make contact or check in with someone.",
                List.of("I'll touch base with you tomorrow morning to discuss the proposal.",
                        "Let's touch base with the client before the end of the week.")));

        IDIOM_LIST.add(new Idiom(749, 'w', "Walk a Tightrope", "To be in a precarious or dangerous situation that requires careful balancing or planning.",
                List.of("The government is walking a tightrope between inflation and recession.",
                        "He is walking a tightrope between pleasing his boss and his team.")));

        IDIOM_LIST.add(new Idiom(750, 'w', "Warts and All", "Including all faults or imperfections.",
                List.of("He described the company's history, warts and all, during the interview.",
                        "I love my hometown, warts and all.")));
        IDIOM_LIST.add(new Idiom(751, 'a', "An Apple of Discord", "A cause or subject of contention or dispute.",
                List.of("The control of the company became an apple of discord among the siblings.",
                        "His inheritance was the apple of discord that tore the family apart.")));

        IDIOM_LIST.add(new Idiom(752, 'b', "Behind the Curve", "Lagging or slow in adopting new ideas or technology.",
                List.of("The industry expert warned the company they were falling behind the curve in digital strategy.",
                        "If you don't update your skills, you'll soon be behind the curve.")));

        IDIOM_LIST.add(new Idiom(753, 'b', "Blue in the Face", "Exhausted from great effort, especially from arguing or pleading.",
                List.of("I argued with him until I was blue in the face, but he wouldn't listen.",
                        "You can complain until you are blue in the face, but the rule won't change.")));

        IDIOM_LIST.add(new Idiom(754, 'b', "Break the Mold", "To do something differently; to deviate from a traditional pattern.",
                List.of("The architect decided to break the mold with a radical new design.",
                        "The startup's unique culture helped them break the mold in their industry.")));

        IDIOM_LIST.add(new Idiom(755, 'b', "Bring Home the Bacon", "To earn money for the family; to be the primary income provider.",
                List.of("She works two jobs to bring home the bacon for her children.",
                        "Since his promotion, he's been bringing home the bacon.")));

        IDIOM_LIST.add(new Idiom(756, 'b', "By the Skin of One's Teeth", "Just barely succeeding or narrowly escaping a disaster.",
                List.of("He passed the exam by the skin of his teeth.",
                        "We caught the train by the skin of our teeth.")));

        IDIOM_LIST.add(new Idiom(757, 'c', "Change of Pace", "A variation or change from what one is used to.",
                List.of("After a long week of work, a weekend trip was a nice change of pace.",
                        "He decided to teach elementary school for a change of pace from his university job.")));

        IDIOM_LIST.add(new Idiom(758, 'c', "Chew the Cud", "To ponder, reflect, or meditate on something.",
                List.of("She took a moment to chew the cud before answering the difficult question.",
                        "We spent the evening chewing the cud over the day's events.")));

        IDIOM_LIST.add(new Idiom(759, 'c', "Cook One's Goose", "To ruin or spoil someone's plans or prospects.",
                List.of("His arrest for shoplifting really cooked his goose for getting into college.",
                        "Missing the final deadline cooked their goose for winning the contract.")));

        IDIOM_LIST.add(new Idiom(760, 'c', "Cream of the Crop", "The best of a group; the highest quality.",
                List.of("This program accepts only the cream of the crop of high school graduates.",
                        "These samples are the cream of the crop from the latest harvest.")));

        IDIOM_LIST.add(new Idiom(761, 'c', "Cry Wolf", "To give false alarm; to warn of danger that is not there.",
                List.of("Because he cried wolf so many times, no one believed him when there was real danger.",
                        "If you keep crying wolf, people will eventually ignore your warnings.")));

        IDIOM_LIST.add(new Idiom(762, 'd', "Dog Days of Summer", "The hottest days of the summer.",
                List.of("It's hard to be productive during the dog days of summer.",
                        "We spent the dog days of summer relaxing by the pool.")));

        IDIOM_LIST.add(new Idiom(763, 'd', "Dressed to the Nines", "Wearing fashionable or formal clothes; dressed elegantly.",
                List.of("They were all dressed to the nines for the awards ceremony.",
                        "You look great—dressed to the nines for your interview!")));

        IDIOM_LIST.add(new Idiom(764, 'e', "Easy Does It", "Slow down; proceed carefully.",
                List.of("That box is fragile, so easy does it!",
                        "Easy does it when you're learning a new skill; take your time.")));

        IDIOM_LIST.add(new Idiom(765, 'f', "Fifth Wheel", "An unwelcome or superfluous person in a group, often a couple.",
                List.of("I felt like a fifth wheel walking with the married couple.",
                        "She hates going to parties alone and being the fifth wheel.")));

        IDIOM_LIST.add(new Idiom(766, 'f', "Fork in the Road", "A point at which a difficult choice has to be made.",
                List.of("After graduation, she reached a fork in the road regarding her career path.",
                        "The business is at a fork in the road: expand or stay small.")));

        IDIOM_LIST.add(new Idiom(767, 'g', "Get the Lowdown", "To get the true or essential information about something.",
                List.of("I called my friend to get the lowdown on the office reorganization.",
                        "Let's meet up and I'll give you the lowdown on the new policy.")));

        IDIOM_LIST.add(new Idiom(768, 'g', "Grind to a Halt", "To slow down, stop, or cease to function.",
                List.of("The factory's production ground to a halt after the power outage.",
                        "Negotiations ground to a halt when neither side would compromise.")));

        IDIOM_LIST.add(new Idiom(769, 'h', "Hands are Tied", "Unable to help or act because of rules, laws, or circumstances.",
                List.of("I'd love to approve the spending, but my hands are tied by the budget rules.",
                        "The staff complained that their hands were tied due to strict regulations.")));

        IDIOM_LIST.add(new Idiom(770, 'h', "Hit the Jackpot", "To achieve great success, often unexpectedly.",
                List.of("He hit the jackpot with his first investment in cryptocurrency.",
                        "We hit the jackpot when we found that perfect house at a low price.")));

        IDIOM_LIST.add(new Idiom(771, 'i', "In the Driver's Seat", "In control of a situation.",
                List.of("Since the promotion, she's been in the driver's seat for all strategic decisions.",
                        "It’s good to finally be in the driver's seat after years of following orders.")));

        IDIOM_LIST.add(new Idiom(772, 'i', "In Your Court", "It is now your responsibility to take action or make a decision.",
                List.of("We’ve sent the proposal; the ball is in your court now.",
                        "I've done all I can; the final decision is in your court.")));

        IDIOM_LIST.add(new Idiom(773, 'j', "Jump Down Someone's Throat", "To criticize or speak angrily to someone, often without provocation.",
                List.of("I just asked a simple question, but he immediately jumped down my throat.",
                        "Don't jump down his throat; he didn't mean any harm.")));

        IDIOM_LIST.add(new Idiom(774, 'j', "Jump the Shark", "A point at which a series, show, or campaign has passed its peak and begun a decline in quality or popularity.",
                List.of("Fans agree that the show officially jumped the shark after the main character left.",
                        "The brand's advertising jumped the shark with that ridiculous commercial.")));

        IDIOM_LIST.add(new Idiom(775, 'k', "Keep a Straight Face", "To manage to look serious and avoid laughing.",
                List.of("The joke was so funny it was hard to keep a straight face.",
                        "She tried to keep a straight face while telling the ridiculous story.")));

        IDIOM_LIST.add(new Idiom(776, 'k', "Knock On Wood", "Used to express hope that a good thing will continue or that a bad thing will not happen.",
                List.of("My car hasn't broken down all year, knock on wood.",
                        "The business has been successful so far, knock on wood.")));

        IDIOM_LIST.add(new Idiom(777, 'l', "Lend an Ear", "To listen sympathetically and carefully to someone.",
                List.of("I was having a rough day, and my friend was kind enough to lend an ear.",
                        "If you need to talk, I'm here to lend an ear.")));

        IDIOM_LIST.add(new Idiom(778, 'l', "Lose Your Touch", "To no longer be able to do something skillfully or effectively as one could before.",
                List.of("He used to be a great salesman, but lately, he seems to have lost his touch.",
                        "I haven't played the piano in years; I've definitely lost my touch.")));

        IDIOM_LIST.add(new Idiom(779, 'm', "Make Light of", "To treat something as unimportant or trivial, especially when it is serious.",
                List.of("He tried to make light of the accident to reassure the others.",
                        "Don't make light of her achievements; they took a lot of hard work.")));

        IDIOM_LIST.add(new Idiom(780, 'm', "Money Talks", "Wealth gives a person or organization power and influence.",
                List.of("They got the prime location because, in this town, money talks.",
                        "It's unfair, but money talks when it comes to getting special treatment.")));

        IDIOM_LIST.add(new Idiom(781, 'n', "No Dice", "An emphatic refusal; no way.",
                List.of("I asked if I could leave early, but the boss said no dice.",
                        "We tried to get the exclusive contract, but it was no dice.")));

        IDIOM_LIST.add(new Idiom(782, 'n', "No Pain, No Gain", "Suffering or effort is necessary to achieve something worthwhile.",
                List.of("You'll never get strong if you don't push yourself—no pain, no gain!",
                        "Waking up early to study is hard, but no pain, no gain.")));

        IDIOM_LIST.add(new Idiom(783, 'o', "Off the Cuff", "Spoken or done without preparation; extemporaneously.",
                List.of("His speech was completely off the cuff, yet very engaging.",
                        "That remark was off the cuff; I didn't mean to offend anyone.")));

        IDIOM_LIST.add(new Idiom(784, 'o', "On Cloud Nine", "Extremely happy; ecstatic.",
                List.of("She's been on cloud nine ever since she won the competition.",
                        "When they announced the new baby, the whole family was on cloud nine.")));

        IDIOM_LIST.add(new Idiom(785, 'o', "Once and For All", "Finally and definitively.",
                List.of("It's time to settle this argument once and for all.",
                        "She decided to clean her garage once and for all.")));

        IDIOM_LIST.add(new Idiom(786, 'o', "Open Book", "Someone or something that is easy to understand and keeps no secrets.",
                List.of("He's an open book; you never have to guess what he's thinking.",
                        "The family's history became an open book after the biography was published.")));

        IDIOM_LIST.add(new Idiom(787, 'p', "Pass the Torch", "To hand down a responsibility or knowledge to the next generation or successor.",
                List.of("The CEO decided it was time to pass the torch to his younger vice president.",
                        "The retiring teacher passed the torch of the debate club to a new mentor.")));

        IDIOM_LIST.add(new Idiom(788, 'p', "Picture Paints a Thousand Words", "A visual image conveys a concept or idea more effectively than a description does.",
                List.of("Instead of writing a long explanation, just send them the chart; a picture paints a thousand words.",
                        "The architect realized a picture paints a thousand words when showing the design.")));

        IDIOM_LIST.add(new Idiom(789, 'p', "Play by the Ear", "To improvise and decide on a course of action as one goes along.",
                List.of("We don't have a strict schedule; we'll just play it by the ear.",
                        "We didn't plan the exact details of the trip; we decided to play it by the ear.")));

        IDIOM_LIST.add(new Idiom(790, 'p', "Put the Cart Before the Horse", "To do things in the wrong order.",
                List.of("You are putting the cart before the horse by buying furniture before finding an apartment.",
                        "Trying to celebrate before winning is putting the cart before the horse.")));

        IDIOM_LIST.add(new Idiom(791, 'r', "Recharge One's Batteries", "To rest and regain energy.",
                List.of("I'm taking a week off work to recharge my batteries.",
                        "A short nap is all I need to recharge my batteries.")));

        IDIOM_LIST.add(new Idiom(792, 'r', "Red Tape", "Excessive official rules and procedures that create delays and difficulty.",
                List.of("We spent weeks cutting through the red tape just to get the permit.",
                        "The company is notorious for its bureaucratic red tape.")));

        IDIOM_LIST.add(new Idiom(793, 's', "Safe Bet", "Something that is almost certain to happen; a sure thing.",
                List.of("It's a safe bet that the new film will be a box office hit.",
                        "I'd say it's a safe bet that the meeting will run late.")));

        IDIOM_LIST.add(new Idiom(794, 's', "Sell Like Hotcakes", "To be sold quickly and in large quantities.",
                List.of("The new game console is selling like hotcakes this holiday season.",
                        "The tickets to the concert sold like hotcakes within minutes of going on sale.")));

        IDIOM_LIST.add(new Idiom(795, 's', "Shoot from the Hip", "To speak or act spontaneously, without thinking first.",
                List.of("His ideas are often good, but he tends to shoot from the hip without doing research.",
                        "The politician regretted shooting from the hip during the interview.")));

        IDIOM_LIST.add(new Idiom(796, 's', "Slow and Steady Wins the Race", "A proverb meaning that reliable effort over a long time is better than a quick burst of energy.",
                List.of("Don't rush the project; slow and steady wins the race.",
                        "He consistently practiced small amounts, proving that slow and steady wins the race.")));

        IDIOM_LIST.add(new Idiom(797, 's', "Smell a Rat", "To suspect that something is wrong or dishonest.",
                List.of("When the accountant suddenly resigned, the owner started to smell a rat.",
                        "I don't trust the dealer's story; I smell a rat.")));

        IDIOM_LIST.add(new Idiom(798, 's', "Square Peg in a Round Hole", "A person who is clearly unsuited to the situation or job they are in.",
                List.of("He's a creative artist stuck in a bureaucratic job; he's a square peg in a round hole.",
                        "Trying to force that solution onto the problem is like putting a square peg in a round hole.")));

        IDIOM_LIST.add(new Idiom(799, 's', "Stand One's Ground", "To maintain one's position or opinion despite opposition or pressure.",
                List.of("The witness stood her ground under intense questioning.",
                        "It takes courage to stand your ground against popular opinion.")));

        IDIOM_LIST.add(new Idiom(800, 't', "Take the Edge Off", "To slightly moderate or lessen the intensity of something, often pain, craving, or tension.",
                List.of("A warm bath helped take the edge off her stress.",
                        "He took a small drink to take the edge off his anxiety before the presentation.")));

        IDIOM_LIST.add(new Idiom(801, 'a', "A Blessing in Disguise", "A seemingly unfortunate thing that ultimately results in something good.",
                List.of("Losing that job was a blessing in disguise; it forced me to start my own successful company.",
                        "The unexpected delay was a blessing in disguise, as it gave us time to find a critical error.")));

        IDIOM_LIST.add(new Idiom(802, 'a', "A Hot Potato", "A controversial issue or situation that is awkward or unpleasant to deal with.",
                List.of("The proposed new zoning law has become a hot potato in local politics.",
                        "Addressing the server vulnerability was a hot potato the IT team wanted to avoid.")));

        IDIOM_LIST.add(new Idiom(803, 'a', "Ace up Your Sleeve", "A secret or hidden advantage that one can use when needed.",
                List.of("The lawyer kept an ace up his sleeve until the final court appearance.",
                        "Having a second job offer was my ace up the sleeve during the salary negotiation.")));

        IDIOM_LIST.add(new Idiom(804, 'a', "All That Glitters Is Not Gold", "Not everything that looks attractive or valuable is actually so.",
                List.of("The expensive car broke down immediately; all that glitters is not gold.",
                        "The job looked glamorous on paper, but all that glitters is not gold.")));

        IDIOM_LIST.add(new Idiom(805, 'a', "At the Drop of a Hat", "Immediately; without hesitation.",
                List.of("She can pack and travel at the drop of a hat.",
                        "The team is ready to respond at the drop of a hat if an emergency occurs.")));

        IDIOM_LIST.add(new Idiom(806, 'b', "Back to Square One", "To return to the beginning, often because of a failure or mistake.",
                List.of("The whole design was rejected, so we are back to square one.",
                        "We need to start from scratch and go back to square one.")));

        IDIOM_LIST.add(new Idiom(807, 'b', "Bide One's Time", "To wait patiently for a good opportunity to arise.",
                List.of("He is biding his time until the housing market improves.",
                        "We need to bide our time and launch the product when demand is highest.")));

        IDIOM_LIST.add(new Idiom(808, 'b', "Bolt from the Blue", "A sudden, unexpected event.",
                List.of("The news of his resignation came like a bolt from the blue.",
                        "The unexpected inheritance was a bolt from the blue.")));

        IDIOM_LIST.add(new Idiom(809, 'b', "Break the Bank", "To cost too much money; to use up all of one's savings.",
                List.of("The new furniture is beautiful, but it's going to break the bank.",
                        "We can afford a small vacation, but nothing that will break the bank.")));

        IDIOM_LIST.add(new Idiom(810, 'b', "Bury the Hatchet", "To reconcile or make peace after a conflict.",
                List.of("After years of feuding, the two brothers decided to bury the hatchet.",
                        "It’s time to bury the hatchet and work together on this project.")));

        IDIOM_LIST.add(new Idiom(811, 'c', "Call It Even", "To consider a debt or dispute settled or balanced.",
                List.of("You paid for lunch, I'll pay for dinner; let's call it even.",
                        "After he fixed my car, I helped him move, so we called it even.")));

        IDIOM_LIST.add(new Idiom(812, 'c', "Can't Make Heads or Tails of Something", "To be unable to understand something at all.",
                List.of("I can't make heads or tails of these complex instructions.",
                        "The new software interface is so confusing, I can't make heads or tails of it.")));

        IDIOM_LIST.add(new Idiom(813, 'c', "Caught Between Two Stools", "Caught between two alternatives, with the result that one misses both.",
                List.of("He tried to please both clients and ended up being caught between two stools.",
                        "The compromise failed, and the board was caught between two stools.")));

        IDIOM_LIST.add(new Idiom(814, 'c', "Change Gears", "To suddenly change one's plans, methods, or subject of conversation.",
                List.of("The manager suddenly changed gears and started discussing the holiday party.",
                        "We need to change gears and focus on the emergency situation.")));

        IDIOM_LIST.add(new Idiom(815, 'c', "Chew the Fat", "To chat idly or generally waste time talking.",
                List.of("We spent the evening just sitting on the porch and chewing the fat.",
                        "The neighbors meet every morning to chew the fat over coffee.")));

        IDIOM_LIST.add(new Idiom(816, 'c', "Cloud Nine", "A state of extreme happiness.",
                List.of("Ever since she got her acceptance letter, she's been on cloud nine.",
                        "He was on cloud nine after the birth of his first child.")));

        IDIOM_LIST.add(new Idiom(817, 'c', "Come Clean", "To confess or reveal the truth about something.",
                List.of("The politician finally came clean about the scandal.",
                        "It’s better to come clean now than to wait until you are caught.")));

        IDIOM_LIST.add(new Idiom(818, 'd', "Dog-Eat-Dog", "A fiercely competitive situation where people will do anything to succeed.",
                List.of("The job market right now is dog-eat-dog.",
                        "It's a dog-eat-dog world in high-stakes finance.")));

        IDIOM_LIST.add(new Idiom(819, 'd', "Don't Give Up Your Day Job", "A gentle insult implying that someone is not very good at something.",
                List.of("I heard his stand-up routine; he shouldn't give up his day job.",
                        "His painting skills are terrible; he definitely shouldn't give up his day job.")));

        IDIOM_LIST.add(new Idiom(820, 'd', "Down the Drain", "Wasted or lost completely.",
                List.of("All that money spent on the failed project went straight down the drain.",
                        "If we don't finish this, all our hard work will go down the drain.")));

        IDIOM_LIST.add(new Idiom(821, 'e', "Eat Crow", "To be forced to acknowledge that one was wrong or defeated; to admit a humiliating mistake.",
                List.of("After loudly predicting failure, he had to eat crow when the product succeeded.",
                        "The expert had to eat crow when his forecast proved incorrect.")));

        IDIOM_LIST.add(new Idiom(822, 'e', "Ears Are Burning", "The sensation that one is being talked about elsewhere.",
                List.of("I feel like my ears are burning; someone must be talking about me.",
                        "We just mentioned his name, and he walked in! Were your ears burning?")));

        IDIOM_LIST.add(new Idiom(823, 'f', "Fall Apart at the Seams", "To fail completely; to become ineffective due to internal difficulties.",
                List.of("The organization started to fall apart at the seams after the leadership resigned.",
                        "The old chair is falling apart at the seams.")));

        IDIOM_LIST.add(new Idiom(824, 'f', "Feast or Famine", "A situation of alternating periods of great abundance and severe lack.",
                List.of("The sales cycle is feast or famine; one month we have too many orders, the next, none.",
                        "Life as a freelance artist is often feast or famine.")));

        IDIOM_LIST.add(new Idiom(825, 'f', "Fine Kettle of Fish", "A mess; a difficult or awkward situation.",
                List.of("We missed the flight and lost our luggage—that's a fine kettle of fish!",
                        "They lost the keys right before leaving. That's a fine kettle of fish.")));

        IDIOM_LIST.add(new Idiom(826, 'f', "Flesh and Blood", "One's own family or close relatives.",
                List.of("He had to help her; she is his own flesh and blood.",
                        "It's hard to turn away from your own flesh and blood.")));

        IDIOM_LIST.add(new Idiom(827, 'g', "Get the Ball Rolling", "To start an activity or process.",
                List.of("Let's get the ball rolling on this new project right away.",
                        "We need to call a meeting to get the ball rolling on the renovation.")));

        IDIOM_LIST.add(new Idiom(828, 'g', "Get the Cold Shoulder", "To be deliberately ignored or treated in an unfriendly way.",
                List.of("After the disagreement, I got the cold shoulder from my colleague.",
                        "She expected a warm welcome but only got the cold shoulder.")));

        IDIOM_LIST.add(new Idiom(829, 'h', "Hard and Fast", "Strictly established or enforced; not easily changed.",
                List.of("There are no hard and fast rules about how to write a good essay.",
                        "We need a hard and fast deadline for the submission.")));

        IDIOM_LIST.add(new Idiom(830, 'h', "Have a Chip on One's Shoulder", "To hold a grudge or have an aggressive attitude because of a past slight or perceived inferiority.",
                List.of("He walks around with a chip on his shoulder ever since he was fired.",
                        "She has a chip on her shoulder about not getting into her first-choice university.")));

        IDIOM_LIST.add(new Idiom(831, 'i', "In Full Swing", "At the height of activity; operating at its maximum level.",
                List.of("The carnival was in full swing by late afternoon.",
                        "The construction work is now in full swing, with workers everywhere.")));

        IDIOM_LIST.add(new Idiom(832, 'i', "In the Same Breath", "If you say two contradictory things in the same breath, you say them almost at the same time.",
                List.of("He criticized the report and then praised the team's work in the same breath.",
                        "She said she was busy but then offered to help, contradicting herself in the same breath.")));

        IDIOM_LIST.add(new Idiom(833, 'j', "Jumping for Joy", "Being extremely happy; thrilled.",
                List.of("When she heard she got the job, she was literally jumping for joy.",
                        "The whole town was jumping for joy after the team won the championship.")));

        IDIOM_LIST.add(new Idiom(834, 'j', "Jury Is Still Out", "A decision has not yet been made; the matter is still uncertain.",
                List.of("The jury is still out on whether the new product will be a success.",
                        "They've made promises, but the jury is still out on their commitment.")));

        IDIOM_LIST.add(new Idiom(835, 'k', "Keep a Low Profile", "To avoid drawing attention to oneself.",
                List.of("The celebrity decided to keep a low profile after the scandal.",
                        "Until the investigation is over, you should keep a low profile.")));

        IDIOM_LIST.add(new Idiom(836, 'k', "Knock Your Socks Off", "To impress or excite someone greatly.",
                List.of("Wait until you try this new recipe; it's going to knock your socks off.",
                        "The concert was amazing; the performance knocked my socks off.")));

        IDIOM_LIST.add(new Idiom(837, 'l', "Leaps and Bounds", "By a very large degree; rapidly.",
                List.of("The new student's English skills are improving by leaps and bounds.",
                        "Our sales have grown by leaps and bounds since the new campaign.")));

        IDIOM_LIST.add(new Idiom(838, 'l', "Lend a Hand", "To help someone with a task.",
                List.of("Could you lend a hand moving this heavy box?",
                        "I always try to lend a hand to my neighbors when they need it.")));

        IDIOM_LIST.add(new Idiom(839, 'l', "Let Off the Hook", "To allow someone to escape punishment or responsibility.",
                List.of("The judge let the first-time offender off the hook with a warning.",
                        "I let my brother off the hook for washing the dishes tonight.")));

        IDIOM_LIST.add(new Idiom(840, 'l', "Lose Your Marbles", "To go crazy; to become mentally unstable.",
                List.of("He’s been working non-stop for weeks—I think he's losing his marbles.",
                        "Did you seriously wear two different shoes? Have you lost your marbles?")));

        IDIOM_LIST.add(new Idiom(841, 'm', "Mad as a Hatter", "Completely crazy or eccentric.",
                List.of("He wears socks with sandals and talks to squirrels; he's mad as a hatter.",
                        "The inventor's ideas seemed mad as a hatter until one of them actually worked.")));

        IDIOM_LIST.add(new Idiom(842, 'm', "Make a Mountain Out of a Molehill", "To exaggerate a minor problem, making it seem much more serious than it is.",
                List.of("It was just a small scratch; don't make a mountain out of a molehill.",
                        "He tends to make a mountain out of a molehill over trivial matters.")));

        IDIOM_LIST.add(new Idiom(843, 'm', "Move Heaven and Earth", "To do everything possible to achieve a goal.",
                List.of("She promised to move heaven and earth to get the project finished on time.",
                        "He would move heaven and earth for his family's safety.")));

        IDIOM_LIST.add(new Idiom(844, 'm', "Muddy the Waters", "To make a situation or issue unclear or confusing.",
                List.of("The contradictory reports only served to muddy the waters on the investigation.",
                        "His vague explanation just muddied the waters for the students.")));

        IDIOM_LIST.add(new Idiom(845, 'n', "Neck and Neck", "Tied in a race or competition.",
                List.of("The two leading candidates are neck and neck in the polls.",
                        "The marathon runners were neck and neck right up to the finish line.")));

        IDIOM_LIST.add(new Idiom(846, 'n', "Nest Egg", "A sum of money saved for a specific purpose, often for retirement.",
                List.of("They are building a nest egg to fund their children's college education.",
                        "His retirement nest egg is substantial after decades of saving.")));

        IDIOM_LIST.add(new Idiom(847, 'n', "Not a Spark of Decency", "Having no morality or kindness whatsoever.",
                List.of("That landlord raised the rent on the struggling family; he doesn't have a spark of decency.",
                        "To cheat a friend out of money shows not a spark of decency.")));

        IDIOM_LIST.add(new Idiom(848, 'o', "On a Roll", "Experiencing a prolonged period of success or good luck.",
                List.of("The team is on a roll, winning five games in a row.",
                        "She's been on a roll with her investments lately.")));

        IDIOM_LIST.add(new Idiom(849, 'o', "On the Wagon", "Abstaining from drinking alcohol.",
                List.of("He hasn't had a drink in a year; he's been on the wagon.",
                        "I can't join you for a glass of wine; I'm on the wagon for a month.")));

        IDIOM_LIST.add(new Idiom(850, 'p', "Pad the Bill", "To add extra, unnecessary charges to a bill or expense report.",
                List.of("The mechanic was caught padding the bill with unnecessary labor hours.",
                        "Be careful when reviewing their invoices, they often try to pad the bill.")));

        IDIOM_LIST.add(new Idiom(851, 'p', "Par for the Course", "What is expected or normal for a particular situation or activity.",
                List.of("The long delays are just par for the course at this airport.",
                        "The technical glitches were par for the course with that old software.")));

        IDIOM_LIST.add(new Idiom(852, 'p', "Picture Paints a Thousand Words", "A visual image conveys a concept or idea more effectively than a description does.",
                List.of("Instead of writing a long explanation, just send them the chart; a picture paints a thousand words.",
                        "The architect realized a picture paints a thousand words when showing the design.")));

        IDIOM_LIST.add(new Idiom(853, 'p', "Poison the Well", "To destroy the reputation or credibility of someone or something, especially in advance.",
                List.of("His opponent tried to poison the well by spreading false rumors before the debate.",
                        "The disgruntled former employee tried to poison the well with the company's best clients.")));

        IDIOM_LIST.add(new Idiom(854, 'p', "Practice Makes Perfect", "Regular exercise of an activity or skill is the way to become proficient in it.",
                List.of("Don't worry if you fail the first time; practice makes perfect.",
                        "She continues to rehearse the song, knowing that practice makes perfect.")));

        IDIOM_LIST.add(new Idiom(855, 'q', "Quick and Dirty", "Done or achieved quickly, usually with low quality or without careful attention to detail.",
                List.of("I just need a quick and dirty estimate for the project's cost.",
                        "It was a quick and dirty solution, but it fixed the immediate problem.")));

        IDIOM_LIST.add(new Idiom(856, 'q', "Quick Fix", "A temporary and easy solution that avoids addressing the underlying problem.",
                List.of("We need a permanent solution, not a quick fix.",
                        "Taping the leak is just a quick fix; we need a new pipe.")));

        IDIOM_LIST.add(new Idiom(857, 'r', "Raining Cats and Dogs", "Raining extremely heavily.",
                List.of("We couldn't go for a walk because it was raining cats and dogs.",
                        "Take an umbrella; it's raining cats and dogs outside.")));

        IDIOM_LIST.add(new Idiom(858, 'r', "Read the Writing on the Wall", "To recognize and understand a clear indication of how a situation is likely to develop.",
                List.of("When the budget was cut, she read the writing on the wall and started looking for a new job.",
                        "The sales figures show the writing on the wall: the product is failing.")));

        IDIOM_LIST.add(new Idiom(859, 'r', "Reinvent the Wheel", "To waste time and effort creating something that already exists or has been done successfully.",
                List.of("Don't reinvent the wheel; just use the existing template for the report.",
                        "We have a process that works; there's no need to reinvent the wheel.")));

        IDIOM_LIST.add(new Idiom(860, 's', "Save Your Breath", "To advise someone that their efforts to convince or argue are futile.",
                List.of("Save your breath; I've already made up my mind.",
                        "He won't change his opinion, so save your breath.")));

        IDIOM_LIST.add(new Idiom(861, 's', "See the Light", "To finally understand or realize the truth about something.",
                List.of("After many arguments, she finally saw the light and accepted the proposal.",
                        "Once I tried the new system, I saw the light and realized how much time I was wasting.")));

        IDIOM_LIST.add(new Idiom(862, 's', "Shape Up or Ship Out", "To improve one's behavior or work performance immediately, or face losing the job/position.",
                List.of("The boss told the underperforming employee to shape up or ship out.",
                        "It's time for the whole team to shape up or ship out.")));

        IDIOM_LIST.add(new Idiom(863, 's', "Shoot Yourself in the Foot", "To hurt your own cause or interest unintentionally.",
                List.of("He shot himself in the foot by bragging about his salary during negotiations.",
                        "By rejecting the easy option, we might shoot ourselves in the foot.")));

        IDIOM_LIST.add(new Idiom(864, 's', "Six of One, Half Dozen of the Other", "Two alternatives that are essentially the same; it makes no difference which one is chosen.",
                List.of("Whether we meet on Tuesday or Wednesday, it's six of one, half dozen of the other.",
                        "They can use the old system or the new one; it's six of one, half dozen of the other.")));

        IDIOM_LIST.add(new Idiom(865, 's', "Snug as a Bug in a Rug", "Very comfortable and cozy.",
                List.of("The baby looked snug as a bug in a rug wrapped in her blanket.",
                        "We were all snug as a bug in a rug by the fireplace.")));

        IDIOM_LIST.add(new Idiom(866, 's', "Stir Up a Hornet's Nest", "To deliberately cause trouble or provoke a violent reaction.",
                List.of("Bringing up that old scandal will only stir up a hornet's nest.",
                        "His controversial comments stirred up a hornet's nest on social media.")));

        IDIOM_LIST.add(new Idiom(867, 't', "Take the Cake", "To be the most remarkable, usually in a negative or absurd way.",
                List.of("Of all the excuses, his story about the alien abduction really takes the cake.",
                        "The manager's bizarre request really takes the cake.")));

        IDIOM_LIST.add(new Idiom(868, 't', "Take the Bull by the Horns", "To deal with a difficult, unpleasant, or dangerous situation bravely and directly.",
                List.of("Instead of procrastinating, she decided to take the bull by the horns and finish the project.",
                        "It's time for us to take the bull by the horns and confront the issue.")));

        IDIOM_LIST.add(new Idiom(869, 't', "The Midas Touch", "The ability to make money easily in any business venture.",
                List.of("Everything he invests in succeeds; he seems to have the Midas touch.",
                        "The new director has the Midas touch, turning failing divisions into successes.")));

        IDIOM_LIST.add(new Idiom(870, 't', "The Best Thing Since Sliced Bread", "An excellent new invention or development.",
                List.of("This new coffee machine is the best thing since sliced bread.",
                        "Everyone thinks the new software is the best thing since sliced bread.")));

        IDIOM_LIST.add(new Idiom(871, 't', "The Devil is in the Details", "Even simple tasks can be complicated due to subtle but crucial details.",
                List.of("The general plan is fine, but be careful—the devil is in the details.",
                        "We need to re-read the contract, because the devil is always in the details.")));

        IDIOM_LIST.add(new Idiom(872, 't', "The Eleventh Hour", "The last possible moment.",
                List.of("He submitted his application at the eleventh hour.",
                        "The contract was approved at the eleventh hour before the deadline.")));

        IDIOM_LIST.add(new Idiom(873, 't', "Throwing Good Money After Bad", "Spending more money on something that is clearly failing or not working.",
                List.of("Continuing to repair that old car is just throwing good money after bad.",
                        "They realized they were throwing good money after bad by keeping the outdated equipment.")));

        IDIOM_LIST.add(new Idiom(874, 't', "Through the Wringer", "To go through a difficult or stressful experience.",
                List.of("The candidate was put through the wringer during the intense interview process.",
                        "After the audit, the entire department felt like they had been put through the wringer.")));

        IDIOM_LIST.add(new Idiom(875, 't', "Tie the Knot", "To get married.",
                List.of("They are planning to tie the knot next summer in Hawaii.",
                        "We decided to tie the knot in a small ceremony.")));

        IDIOM_LIST.add(new Idiom(876, 't', "Too Many Cooks Spoil the Broth", "If too many people are involved in a task, it will be poorly done.",
                List.of("The design team had too many opinions; it proved that too many cooks spoil the broth.",
                        "Let's limit the decisions to two people; we don't want too many cooks spoiling the broth.")));

        IDIOM_LIST.add(new Idiom(877, 't', "Touch Base", "To briefly make contact or check in with someone.",
                List.of("I'll touch base with you tomorrow morning to discuss the proposal.",
                        "Let's touch base with the client before the end of the week.")));

        IDIOM_LIST.add(new Idiom(878, 't', "Two Peas in a Pod", "Two people who are very similar in appearance, behavior, or interests.",
                List.of("The twins are two peas in a pod; they finish each other's sentences.",
                        "They both love obscure music; they are two peas in a pod.")));

        IDIOM_LIST.add(new Idiom(879, 'u', "Under the Gun", "Under pressure or stress, typically because of an approaching deadline.",
                List.of("We are under the gun to finish this report before the end of the day.",
                        "The team is always under the gun during tax season.")));

        IDIOM_LIST.add(new Idiom(880, 'u', "Under the Table", "Done secretly or illegally, often referring to a cash transaction to avoid tax.",
                List.of("They paid the worker under the table to avoid paying proper taxes and benefits.",
                        "The bribe was offered under the table to influence the decision.")));

        IDIOM_LIST.add(new Idiom(881, 'w', "Walk on Eggshells", "To be very careful and cautious in one's actions or words to avoid offending someone.",
                List.of("Ever since the argument, I've had to walk on eggshells around him.",
                        "The employees feel like they have to walk on eggshells when the demanding client is visiting.")));

        IDIOM_LIST.add(new Idiom(882, 'w', "Wear Many Hats", "To have many different roles or responsibilities.",
                List.of("As a small business owner, she has to wear many hats.",
                        "In our small department, everyone wears many hats to get the job done.")));

        IDIOM_LIST.add(new Idiom(883, 'w', "When in Rome, Do as the Romans Do", "When you are in a foreign place or new situation, you should follow the customs of the people there.",
                List.of("I don't usually eat such late dinners, but when in Rome, do as the Romans do.",
                        "The host convinced her to try the local dish, saying, 'When in Rome...'")));

        IDIOM_LIST.add(new Idiom(884, 'w', "Witch Hunt", "An intensive, often paranoid, effort to find and expose disloyal or undesirable people.",
                List.of("The investigation felt more like a witch hunt targeting one specific department.",
                        "The media called the politician's pursuit of whistleblowers a witch hunt.")));

        IDIOM_LIST.add(new Idiom(885, 'w', "Word of Mouth", "Information passed from person to person through speaking.",
                List.of("The restaurant relies on word of mouth advertising rather than expensive campaigns.",
                        "We found out about the job opening through word of mouth.")));

        IDIOM_LIST.add(new Idiom(886, 'w', "Wrap Up", "To complete or finish something.",
                List.of("Let's wrap up this meeting and head to lunch.",
                        "They need one more day to wrap up the construction work.")));

        IDIOM_LIST.add(new Idiom(887, 'y', "You Can Say That Again", "A phrase used to express strong agreement with something someone has just said.",
                List.of("A: This weather is absolutely miserable. B: You can say that again!",
                        "A: That was the best concert ever. B: You can say that again!")));

        IDIOM_LIST.add(new Idiom(888, 'z', "Zero In On", "To focus all attention onto a particular target or subject.",
                List.of("The discussion needs to zero in on the core budget issues.",
                        "The sniper zeroed in on the target and took the shot.")));

        IDIOM_LIST.add(new Idiom(889, 'a', "An Apple of Discord", "A cause or subject of contention or dispute.",
                List.of("The control of the company became an apple of discord among the siblings.",
                        "His inheritance was the apple of discord that tore the family apart.")));

        IDIOM_LIST.add(new Idiom(890, 'b', "Behind the Curve", "Lagging or slow in adopting new ideas or technology.",
                List.of("The industry expert warned the company they were falling behind the curve in digital strategy.",
                        "If you don't update your skills, you'll soon be behind the curve.")));

        IDIOM_LIST.add(new Idiom(891, 'b', "Bring Home the Bacon", "To earn money for the family; to be the primary income provider.",
                List.of("She works two jobs to bring home the bacon for her children.",
                        "Since his promotion, he's been bringing home the bacon.")));

        IDIOM_LIST.add(new Idiom(892, 'b', "Bury the Hatchet", "To reconcile or make peace after a conflict.",
                List.of("After years of feuding, the two brothers decided to bury the hatchet.",
                        "It’s time to bury the hatchet and work together on this project.")));

        IDIOM_LIST.add(new Idiom(893, 'c', "Change of Pace", "A variation or change from what one is used to.",
                List.of("After a long week of work, a weekend trip was a nice change of pace.",
                        "He decided to teach elementary school for a change of pace from his university job.")));

        IDIOM_LIST.add(new Idiom(894, 'c', "Chew the Cud", "To ponder, reflect, or meditate on something.",
                List.of("She took a moment to chew the cud before answering the difficult question.",
                        "We spent the evening chewing the cud over the day's events.")));

        IDIOM_LIST.add(new Idiom(895, 'c', "Cook One's Goose", "To ruin or spoil someone's plans or prospects.",
                List.of("His arrest for shoplifting really cooked his goose for getting into college.",
                        "Missing the final deadline cooked their goose for winning the contract.")));

        IDIOM_LIST.add(new Idiom(896, 'c', "Cry Wolf", "To give false alarm; to warn of danger that is not there.",
                List.of("Because he cried wolf so many times, no one believed him when there was real danger.",
                        "If you keep crying wolf, people will eventually ignore your warnings.")));

        IDIOM_LIST.add(new Idiom(897, 'd', "Devil May Care", "Reckless, careless, or indifferent; having a casual disregard for serious matters.",
                List.of("He had a devil may care attitude toward his finances.",
                        "The young explorers had a devil may care spirit about danger.")));

        IDIOM_LIST.add(new Idiom(898, 'd', "Down the Drain", "Wasted or lost completely.",
                List.of("All that money spent on the failed project went straight down the drain.",
                        "If we don't finish this, all our hard work will go down the drain.")));

        IDIOM_LIST.add(new Idiom(899, 'f', "Feather in One's Cap", "An achievement or something to be proud of.",
                List.of("Getting published was a major feather in her cap.",
                        "Winning the industry award was a big feather in the company's cap.")));

        IDIOM_LIST.add(new Idiom(900, 'h', "Hard Pill to Swallow", "A situation or piece of information that is difficult or unpleasant to accept.",
                List.of("The news of the budget cuts was a hard pill to swallow for the department.",
                        "Admitting his mistake was a hard pill to swallow for the proud executive.")));

        IDIOM_LIST.add(new Idiom(901, 'h', "Have One's Cake and Eat It Too", "To want or try to have two desirable things that are impossible to have simultaneously.",
                List.of("She wants a promotion without taking on extra work; she wants to have her cake and eat it too.",
                        "You can't have your cake and eat it too in this investment.")));

        IDIOM_LIST.add(new Idiom(902, 'h', "Head Over Heels", "Deeply in love.",
                List.of("They are head over heels in love and plan to marry next year.",
                        "He fell head over heels for her the moment they met.")));

        IDIOM_LIST.add(new Idiom(903, 'i', "In a Pickle", "In a difficult or messy situation.",
                List.of("I forgot my wallet and my keys, so I'm really in a pickle now.",
                        "The unexpected rain left us in a pickle with all the outside equipment.")));

        IDIOM_LIST.add(new Idiom(904, 'i', "In the Dark", "Uninformed; unaware of essential facts.",
                List.of("The board made the decision and left the rest of us completely in the dark.",
                        "I was in the dark about the surprise party until the last minute.")));

        IDIOM_LIST.add(new Idiom(905, 'i', "In the Loop", "Part of a group that is kept informed about something.",
                List.of("Make sure you keep me in the loop regarding any budget changes.",
                        "The manager ensures that all team members are in the loop on project updates.")));

        IDIOM_LIST.add(new Idiom(906, 'i', "In the Red", "Losing money; operating at a loss (referring to the color of negative numbers in accounting).",
                List.of("The company has been operating in the red for three quarters.",
                        "We need to cut costs to get out of the red.")));

        IDIOM_LIST.add(new Idiom(907, 'i', "Iron Out", "To resolve difficulties or disagreements.",
                List.of("The lawyers are meeting tomorrow to iron out the final details of the contract.",
                        "We need to iron out the schedule before the conference begins.")));

        IDIOM_LIST.add(new Idiom(908, 'j', "Jumping the Shark", "A point at which a series, show, or campaign has passed its peak and begun a decline in quality or popularity.",
                List.of("Fans agree that the show officially jumped the shark after the main character left.",
                        "The brand's advertising jumped the shark with that ridiculous commercial.")));

        IDIOM_LIST.add(new Idiom(909, 'k', "Keep a Low Profile", "To avoid drawing attention to oneself.",
                List.of("The celebrity decided to keep a low profile after the scandal.",
                        "Until the investigation is over, you should keep a low profile.")));

        IDIOM_LIST.add(new Idiom(910, 'k', "Keep Tabs On", "To monitor or keep track of someone or something.",
                List.of("The teacher keeps tabs on the students who struggle with homework.",
                        "I keep tabs on the competitor's prices by checking their website daily.")));

        IDIOM_LIST.add(new Idiom(911, 'k', "Kick the Bucket", "To die (informal and somewhat crude).",
                List.of("The old car finally kicked the bucket on the highway.",
                        "My grandpa lived a long life before he finally kicked the bucket.")));

        IDIOM_LIST.add(new Idiom(912, 'l', "Lame Duck", "An elected official or group continuing in office during the period between an election defeat and a successor's assumption of office.",
                List.of("The former president became a lame duck after the November election.",
                        "The committee is now a lame duck and can't pass major legislation.")));

        IDIOM_LIST.add(new Idiom(913, 'l', "Last Resort", "A final option when all others have failed.",
                List.of("Calling the emergency number was their last resort.",
                        "We'll use the reserve funds as a last resort.")));

        IDIOM_LIST.add(new Idiom(914, 'l', "Let Sleeping Dogs Lie", "To leave a situation undisturbed because getting involved could cause trouble.",
                List.of("The dispute happened years ago; it’s best to let sleeping dogs lie.",
                        "Don't bring up the past issue with the budget; just let sleeping dogs lie.")));

        IDIOM_LIST.add(new Idiom(915, 'l', "Like a Broken Record", "Constantly repeating the same thing.",
                List.of("He keeps complaining about the food like a broken record.",
                        "Stop talking about your injury; you sound like a broken record.")));

        IDIOM_LIST.add(new Idiom(916, 'm', "Mad as a Wet Hen", "Extremely angry or annoyed.",
                List.of("She was mad as a wet hen when she found out they had canceled her reservation.",
                        "Don't tell him the bad news; he's already mad as a wet hen.")));

        IDIOM_LIST.add(new Idiom(917, 'm', "Make Ends Meet", "To earn just enough money to live on.",
                List.of("After losing his job, he struggled to make ends meet.",
                        "Many students work part-time just to make ends meet.")));

        IDIOM_LIST.add(new Idiom(918, 'm', "Money Talks", "Wealth gives a person or organization power and influence.",
                List.of("They got the prime location because, in this town, money talks.",
                        "It's unfair, but money talks when it comes to getting special treatment.")));

        IDIOM_LIST.add(new Idiom(919, 'n', "Neck and Neck", "Tied in a race or competition.",
                List.of("The two leading candidates are neck and neck in the polls.",
                        "The marathon runners were neck and neck right up to the finish line.")));

        IDIOM_LIST.add(new Idiom(920, 'n', "New Blood", "New members in a group or organization, especially ones who bring new ideas and energy.",
                List.of("The organization desperately needs some new blood to revitalize its efforts.",
                        "Hiring recent graduates brought new blood into the stagnant department.")));

        IDIOM_LIST.add(new Idiom(921, 'n', "New Lease on Life", "A renewed energy or interest in life; a fresh start.",
                List.of("After his recovery, he felt he had a new lease on life.",
                        "The renovation gave the old building a new lease on life.")));

        IDIOM_LIST.add(new Idiom(922, 'n', "No-Brainer", "A decision or choice that is so obvious that it requires little or no thought.",
                List.of("Accepting that job offer was a complete no-brainer.",
                        "Buying the discounted tickets was a no-brainer.")));

        IDIOM_LIST.add(new Idiom(923, 'n', "Not Hold Water", "Of an argument or explanation, to seem illogical, untrue, or indefensible.",
                List.of("His alibi does not hold water, as witnesses saw him at the scene.",
                        "The lawyer's arguments simply did not hold water with the jury.")));

        IDIOM_LIST.add(new Idiom(924, 'o', "Off the Record", "Not intended to be made public or quoted officially.",
                List.of("The mayor made a few comments off the record after the press conference.",
                        "What I'm telling you is off the record, so don't tell anyone.")));

        IDIOM_LIST.add(new Idiom(925, 'o', "On a Roll", "Experiencing a prolonged period of success or good luck.",
                List.of("The team is on a roll, winning five games in a row.",
                        "She's been on a roll with her investments lately.")));

        IDIOM_LIST.add(new Idiom(926, 'o', "On the Dot", "Exactly on time; precisely.",
                List.of("The meeting started at 9:00 AM on the dot.",
                        "Please arrive at the station at 7:30 on the dot.")));

        IDIOM_LIST.add(new Idiom(927, 'o', "Open a Can of Worms", "To create a complex situation or unleash a number of unpredictable problems.",
                List.of("The audit will open a huge can of worms about how the funds were spent.",
                        "Be careful discussing politics, you don't want to open a can of worms at the dinner table.")));

        IDIOM_LIST.add(new Idiom(928, 'p', "Pass With Flying Colors", "To pass a test, examination, or course easily and with a very high score.",
                List.of("She studied all night and passed her final exam with flying colors.",
                        "The team completed the safety inspection with flying colors.")));

        IDIOM_LIST.add(new Idiom(929, 'p', "Peanut Gallery", "A group of people giving unwanted and usually unqualified criticism or commentary.",
                List.of("He ignored the noise from the peanut gallery and continued his speech.",
                        "Stop listening to the peanut gallery and trust your own judgment.")));

        IDIOM_LIST.add(new Idiom(930, 'p', "Penny-Pinching", "Being very careful with money; frugal or stingy.",
                List.of("The company's penny-pinching habits often lead to low-quality products.",
                        "He is a penny-pinching millionaire who hates spending money.")));

        IDIOM_LIST.add(new Idiom(931, 'p', "Play Second Fiddle", "To take a subordinate or less important role than someone else.",
                List.of("She got tired of always playing second fiddle to the department head.",
                        "He was content to play second fiddle to the star musician.")));

        IDIOM_LIST.add(new Idiom(932, 'r', "Raise the Bar", "To increase the standard that is expected or required.",
                List.of("The new artistic director immediately raised the bar for all performances.",
                        "Our goal is to raise the bar for customer service in the industry.")));

        IDIOM_LIST.add(new Idiom(933, 'r', "Red-Letter Day", "A day that is memorable because of some important or happy event.",
                List.of("The day the contract was signed was a red-letter day for the startup.",
                        "My graduation was a real red-letter day for the whole family.")));

        IDIOM_LIST.add(new Idiom(934, 's', "Safe and Sound", "Uninjured, unharmed, or secure.",
                List.of("Despite the storm, the ship made it back to port safe and sound.",
                        "The lost hiker was found safe and sound after three days.")));

        IDIOM_LIST.add(new Idiom(935, 's', "Shake a Leg", "To hurry up; to move faster.",
                List.of("We’re going to be late! Shake a leg!",
                        "Come on, shake a leg, or we'll miss the bus.")));

        IDIOM_LIST.add(new Idiom(936, 's', "Shine On", "To continue or persevere despite difficulty (often used dismissively or sarcastically in some contexts).",
                List.of("They are struggling, but they intend to shine on and succeed.",
                        "Just ignore the criticism and shine on.")));

        IDIOM_LIST.add(new Idiom(937, 's', "Show Your True Colors", "To reveal one's real nature or character, especially after having concealed it.",
                List.of("When the pressure mounted, he showed his true colors and became very rude.",
                        "The crisis made the politician show his true colors to the public.")));

        IDIOM_LIST.add(new Idiom(938, 't', "Take the Heat", "To endure the criticism or blame for something.",
                List.of("The manager had to take the heat for the team's mistakes.",
                        "He was willing to take the heat for the unpopular decision.")));

        IDIOM_LIST.add(new Idiom(939, 't', "The Early Bird Gets the Worm", "Success comes to those who prepare well and arrive or act early.",
                List.of("If you want the best seat at the show, remember the early bird gets the worm.",
                        "We started marketing early because the early bird gets the worm.")));

        IDIOM_LIST.add(new Idiom(940, 't', "The Whole Nine Yards", "Everything; the entire amount or extent.",
                List.of("When they renovated the kitchen, they went the whole nine yards with new appliances and cabinets.",
                        "Tell me about your trip—the whole nine yards.")));

        IDIOM_LIST.add(new Idiom(941, 't', "Through the Grapevine", "Hearing news or information informally, by rumor or gossip.",
                List.of("I heard through the grapevine that the company is moving its headquarters.",
                        "Don't trust the gossip you hear through the grapevine; it might not be true.")));

        IDIOM_LIST.add(new Idiom(942, 't', "Time Flies When You're Having Fun", "Time seems to pass quickly when you are enjoying yourself.",
                List.of("It's midnight already? Time flies when you're having fun!",
                        "We spent the whole day talking; time really flies when you're having fun.")));

        IDIOM_LIST.add(new Idiom(943, 't', "To Steal Someone's Thunder", "To take attention away from someone else's achievement.",
                List.of("She announced her promotion right after I finished my presentation, totally stealing my thunder.",
                        "The rival company tried to steal our thunder by releasing a similar product a day earlier.")));

        IDIOM_LIST.add(new Idiom(944, 't', "To Get Under Someone's Skin", "To irritate or annoy someone intensely.",
                List.of("His constant humming really gets under my skin.",
                        "I try to ignore his rude comments, but they still get under my skin.")));

        IDIOM_LIST.add(new Idiom(945, 't', "To Get Your Feet Wet", "To begin to gain experience in a particular area of activity.",
                List.of("I'm starting with small tasks just to get my feet wet in the new role.",
                        "The internship is a great way to get your feet wet in the publishing industry.")));

        IDIOM_LIST.add(new Idiom(946, 't', "Turn a Blind Eye", "To intentionally ignore a situation or behavior that you know is wrong.",
                List.of("The security guard was criticized for turning a blind eye to the vandalism.",
                        "He turned a blind eye to his colleague's constant lateness.")));

        IDIOM_LIST.add(new Idiom(947, 'w', "Warm the Cockles of Your Heart", "To cause a feeling of pleasure, contentment, or warmth.",
                List.of("The unexpected gift truly warmed the cockles of her heart.",
                        "Seeing the old friends reunite was a sight that warmed the cockles of my heart.")));

        IDIOM_LIST.add(new Idiom(948, 'w', "Walk a Tightrope", "To be in a precarious or dangerous situation that requires careful balancing or planning.",
                List.of("The government is walking a tightrope between inflation and recession.",
                        "He is walking a tightrope between pleasing his boss and his team.")));

        IDIOM_LIST.add(new Idiom(949, 'w', "Water Under the Bridge", "Something that happened in the past and is now over and forgotten.",
                List.of("Our old arguments are water under the bridge now.",
                        "I forgave her long ago; it's all just water under the bridge.")));

        IDIOM_LIST.add(new Idiom(950, 'w', "Wet Behind the Ears", "Inexperienced, naive, or new to a job.",
                List.of("He's too wet behind the ears to handle this complex negotiation.",
                        "You can't trust the judgment of someone still wet behind the ears.")));
        IDIOM_LIST.add(new Idiom(951, 'w', "White Elephant", "A possession that is useless, troublesome, or expensive to maintain.",
                List.of("The huge old factory became a white elephant for the city.",
                        "That expensive piece of gym equipment is a white elephant; no one ever uses it.")));

        IDIOM_LIST.add(new Idiom(952, 'w', "Wild Goose Chase", "A hopeless, complicated, or aimless search for something.",
                List.of("We followed the incorrect directions for hours—it was a real wild goose chase.",
                        "Sending me to three different offices for one signature felt like a wild goose chase.")));

        IDIOM_LIST.add(new Idiom(953, 'a', "Actions Speak Louder Than Words", "What you do is more important than what you say.",
                List.of("The manager promised a bonus, but until we see the money, actions speak louder than words.",
                        "She apologized, but actions speak louder than words; she needs to change her behavior.")));

        IDIOM_LIST.add(new Idiom(954, 'a', "All in the Same Boat", "To be in the same difficult or unfortunate circumstances as others.",
                List.of("We all missed the deadline, so we're all in the same boat.",
                        "No one got a bonus this year, so we are all in the same boat.")));

        IDIOM_LIST.add(new Idiom(955, 'a', "An Ace up One's Sleeve", "A secret or hidden advantage that one can use when needed.",
                List.of("The lawyer kept an ace up his sleeve until the final court appearance.",
                        "Having a second job offer was my ace up the sleeve during the salary negotiation.")));

        IDIOM_LIST.add(new Idiom(956, 'b', "Back to Square One", "To return to the beginning, often because of a failure or mistake.",
                List.of("The whole design was rejected, so we are back to square one.",
                        "We need to start from scratch and go back to square one.")));

        IDIOM_LIST.add(new Idiom(957, 'b', "Bite the Dust", "To die, or to break down and stop working.",
                List.of("The old lawnmower finally bit the dust after twenty years.",
                        "The villain was defeated and bit the dust in the final scene.")));

        IDIOM_LIST.add(new Idiom(958, 'b', "Break the Bank", "To cost too much money; to use up all of one's savings.",
                List.of("The new furniture is beautiful, but it's going to break the bank.",
                        "We can afford a small vacation, but nothing that will break the bank.")));

        IDIOM_LIST.add(new Idiom(959, 'b', "Bury the Hatchet", "To reconcile or make peace after a conflict.",
                List.of("After years of feuding, the two brothers decided to bury the hatchet.",
                        "It’s time to bury the hatchet and work together on this project.")));

        IDIOM_LIST.add(new Idiom(960, 'c', "Call It Even", "To consider a debt or dispute settled or balanced.",
                List.of("You paid for lunch, I'll pay for dinner; let's call it even.",
                        "After he fixed my car, I helped him move, so we called it even.")));

        IDIOM_LIST.add(new Idiom(961, 'c', "Can't Make Heads or Tails of Something", "To be unable to understand something at all.",
                List.of("I can't make heads or tails of these complex instructions.",
                        "The new software interface is so confusing, I can't make heads or tails of it.")));

        IDIOM_LIST.add(new Idiom(962, 'c', "Change of Heart", "A change in one's opinion or attitude.",
                List.of("After meeting the team, he had a change of heart about leaving the company.",
                        "She had a change of heart and decided not to sell the painting.")));

        IDIOM_LIST.add(new Idiom(963, 'c', "Cloud Nine", "A state of extreme happiness.",
                List.of("Ever since she got her acceptance letter, she's been on cloud nine.",
                        "He was on cloud nine after the birth of his first child.")));

        IDIOM_LIST.add(new Idiom(964, 'c', "Cold Turkey", "Abruptly and completely stopping an addictive or habitual behavior.",
                List.of("She quit smoking cold turkey last year and hasn't looked back.",
                        "He decided to stop drinking coffee cold turkey.")));

        IDIOM_LIST.add(new Idiom(965, 'c', "Come Clean", "To confess or reveal the truth about something.",
                List.of("The politician finally came clean about the scandal.",
                        "It’s better to come clean now than to wait until you are caught.")));

        IDIOM_LIST.add(new Idiom(966, 'd', "Dog-Eat-Dog", "A fiercely competitive situation where people will do anything to succeed.",
                List.of("The job market right now is dog-eat-dog.",
                        "It's a dog-eat-dog world in high-stakes finance.")));

        IDIOM_LIST.add(new Idiom(967, 'd', "Donkey's Years", "A very long time.",
                List.of("I haven't seen you in donkey's years!",
                        "It took donkey's years to get the approval needed for the project.")));

        IDIOM_LIST.add(new Idiom(968, 'd', "Drive Someone Up the Wall", "To irritate or annoy someone greatly.",
                List.of("That loud music is driving me up the wall!",
                        "His constant complaining drives everyone up the wall.")));

        IDIOM_LIST.add(new Idiom(969, 'e', "Eat Crow", "To be forced to acknowledge that one was wrong or defeated; to admit a humiliating mistake.",
                List.of("After loudly predicting failure, he had to eat crow when the product succeeded.",
                        "The expert had to eat crow when his forecast proved incorrect.")));

        IDIOM_LIST.add(new Idiom(970, 'f', "Fall Apart at the Seams", "To fail completely; to become ineffective due to internal difficulties.",
                List.of("The organization started to fall apart at the seams after the leadership resigned.",
                        "The old chair is falling apart at the seams.")));

        IDIOM_LIST.add(new Idiom(971, 'f', "Feast or Famine", "A situation of alternating periods of great abundance and severe lack.",
                List.of("The sales cycle is feast or famine; one month we have too many orders, the next, none.",
                        "Life as a freelance artist is often feast or famine.")));

        IDIOM_LIST.add(new Idiom(972, 'f', "Fish Out of Water", "Feeling uncomfortable or awkward in an unfamiliar environment.",
                List.of("As a city person in the remote village, I felt like a fish out of water.",
                        "He was a physicist at the art convention, completely a fish out of water.")));

        IDIOM_LIST.add(new Idiom(973, 'f', "Full of Hot Air", "Talking foolishly or boastfully; unreliable in what one says.",
                List.of("Don't listen to his promises; he's full of hot air.",
                        "That politician is full of hot air and never follows through.")));

        IDIOM_LIST.add(new Idiom(974, 'g', "Get the Ball Rolling", "To start an activity or process.",
                List.of("Let's get the ball rolling on this new project right away.",
                        "We need to call a meeting to get the ball rolling on the renovation.")));

        IDIOM_LIST.add(new Idiom(975, 'g', "Get the Cold Shoulder", "To be deliberately ignored or treated in an unfriendly way.",
                List.of("After the disagreement, I got the cold shoulder from my colleague.",
                        "She expected a warm welcome but only got the cold shoulder.")));

        IDIOM_LIST.add(new Idiom(976, 'h', "Hard and Fast", "Strictly established or enforced; not easily changed.",
                List.of("There are no hard and fast rules about how to write a good essay.",
                        "We need a hard and fast deadline for the submission.")));

        IDIOM_LIST.add(new Idiom(977, 'h', "Have a Chip on One's Shoulder", "To hold a grudge or have an aggressive attitude because of a past slight or perceived inferiority.",
                List.of("He walks around with a chip on his shoulder ever since he was fired.",
                        "She has a chip on her shoulder about not getting into her first-choice university.")));

        IDIOM_LIST.add(new Idiom(978, 'h', "Hit the Jackpot", "To achieve great success, often unexpectedly.",
                List.of("He hit the jackpot with his first investment in cryptocurrency.",
                        "We hit the jackpot when we found that perfect house at a low price.")));

        IDIOM_LIST.add(new Idiom(979, 'i', "In Full Swing", "At the height of activity; operating at its maximum level.",
                List.of("The carnival was in full swing by late afternoon.",
                        "The construction work is now in full swing, with workers everywhere.")));

        IDIOM_LIST.add(new Idiom(980, 'j', "Jumping for Joy", "Being extremely happy; thrilled.",
                List.of("When she heard she got the job, she was literally jumping for joy.",
                        "The whole town was jumping for joy after the team won the championship.")));

        IDIOM_LIST.add(new Idiom(981, 'k', "Keep a Straight Face", "To manage to look serious and avoid laughing.",
                List.of("The joke was so funny it was hard to keep a straight face.",
                        "She tried to keep a straight face while telling the ridiculous story.")));

        IDIOM_LIST.add(new Idiom(982, 'k', "Knock Your Socks Off", "To impress or excite someone greatly.",
                List.of("Wait until you try this new recipe; it's going to knock your socks off.",
                        "The concert was amazing; the performance knocked my socks off.")));

        IDIOM_LIST.add(new Idiom(983, 'l', "Leaps and Bounds", "By a very large degree; rapidly.",
                List.of("The new student's English skills are improving by leaps and bounds.",
                        "Our sales have grown by leaps and bounds since the new campaign.")));

        IDIOM_LIST.add(new Idiom(984, 'l', "Lend a Hand", "To help someone with a task.",
                List.of("Could you lend a hand moving this heavy box?",
                        "I always try to lend a hand to my neighbors when they need it.")));

        IDIOM_LIST.add(new Idiom(985, 'l', "Let Off the Hook", "To allow someone to escape punishment or responsibility.",
                List.of("The judge let the first-time offender off the hook with a warning.",
                        "I let my brother off the hook for washing the dishes tonight.")));

        IDIOM_LIST.add(new Idiom(986, 'l', "Lose Your Marbles", "To go crazy; to become mentally unstable.",
                List.of("He’s been working non-stop for weeks—I think he's losing his marbles.",
                        "Did you seriously wear two different shoes? Have you lost your marbles?")));

        IDIOM_LIST.add(new Idiom(987, 'm', "Mad as a Hatter", "Completely crazy or eccentric.",
                List.of("He wears socks with sandals and talks to squirrels; he's mad as a hatter.",
                        "The inventor's ideas seemed mad as a hatter until one of them actually worked.")));

        IDIOM_LIST.add(new Idiom(988, 'm', "Make a Mountain Out of a Molehill", "To exaggerate a minor problem, making it seem much more serious than it is.",
                List.of("It was just a small scratch; don't make a mountain out of a molehill.",
                        "He tends to make a mountain out of a molehill over trivial matters.")));

        IDIOM_LIST.add(new Idiom(989, 'n', "New Lease on Life", "A renewed energy or interest in life; a fresh start.",
                List.of("After his recovery, he felt he had a new lease on life.",
                        "The renovation gave the old building a new lease on life.")));

        IDIOM_LIST.add(new Idiom(990, 'n', "No-Brainer", "A decision or choice that is so obvious that it requires little or no thought.",
                List.of("Accepting that job offer was a complete no-brainer.",
                        "Buying the discounted tickets was a no-brainer.")));

        IDIOM_LIST.add(new Idiom(991, 'o', "On a Roll", "Experiencing a prolonged period of success or good luck.",
                List.of("The team is on a roll, winning five games in a row.",
                        "She's been on a roll with her investments lately.")));

        IDIOM_LIST.add(new Idiom(992, 'o', "On the Wagon", "Abstaining from drinking alcohol.",
                List.of("He hasn't had a drink in a year; he's been on the wagon.",
                        "I can't join you for a glass of wine; I'm on the wagon for a month.")));

        IDIOM_LIST.add(new Idiom(993, 'p', "Pad the Bill", "To add extra, unnecessary charges to a bill or expense report.",
                List.of("The mechanic was caught padding the bill with unnecessary labor hours.",
                        "Be careful when reviewing their invoices, they often try to pad the bill.")));

        IDIOM_LIST.add(new Idiom(994, 'r', "Read the Riot Act", "To issue a stern warning with clear consequences for misbehavior.",
                List.of("The coach read the riot act to the team after their dismal performance.",
                        "My mother read me the riot act after I broke curfew.")));

        IDIOM_LIST.add(new Idiom(995, 's', "Sell Yourself Short", "To underestimate one's own worth or abilities; to accept less than one deserves.",
                List.of("Don't sell yourself short in the salary negotiation; you deserve that raise.",
                        "She is so talented, but she often sells herself short by being too modest.")));

        IDIOM_LIST.add(new Idiom(996, 's', "Shoot from the Hip", "To speak or act spontaneously, without thinking first.",
                List.of("His ideas are often good, but he tends to shoot from the hip without doing research.",
                        "The politician regretted shooting from the hip during the interview.")));

        IDIOM_LIST.add(new Idiom(997, 't', "Take the Heat", "To endure the criticism or blame for something.",
                List.of("The manager had to take the heat for the team's mistakes.",
                        "He was willing to take the heat for the unpopular decision.")));

        IDIOM_LIST.add(new Idiom(998, 't', "Taste of Your Own Medicine", "To experience the same unpleasantness or bad treatment that you have given to others.",
                List.of("After always making fun of others, he finally got a taste of his own medicine.",
                        "It's about time she got a taste of her own medicine for being so rude.")));

        IDIOM_LIST.add(new Idiom(999, 't', "The Last Hurdle", "The final difficulty or obstacle in a process.",
                List.of("The presentation is finished; all we have left is the last hurdle of client approval.",
                        "Getting the final signature was the last hurdle for the project.")));

        IDIOM_LIST.add(new Idiom(1000, 't', "Tighten Your Belt", "To reduce spending; to live more frugally.",
                List.of("With the economy slowing, everyone has to tighten their belt.",
                        "We need to tighten our belt until the next paycheck arrives.")));
    }

    public static List<Idiom> getIdiomList() {
        return new ArrayList<>(IDIOM_LIST); // Return copy to prevent external modification
    }

}