# y11p
WHS Year 11 CSC112 Project - Dungeon Crawler

Startup File: main/Main

Created by: Theo Frazer

### Game Instructions
- This game is a dungeon crawler, where you progress through rooms and fight monsters until you manage to escape.
- You will be prompted for inputs.
- If you enter an input with a value other than an expected one, the game will reject it and ask for the input again.
- If the last printed line is a statement, not a question, press enter.
- To move, type 'move', and the direction you would like to move in. [e.g 'south', 'east', or 'north']
- You have 30 health, and that health is regenerated after each battle.
- Your basic actions are as follows:
  - move [direction]
  - fight
  - customise (see reference)
  - exit (closes the game)

### Customisation
- You can customise your weapons using the 'customise' command. 
- You will be given several prompts as to what you would like to customise.
- Customisation is based off of a points system, using your hit chance, base damage, and your damage dice. 
- You can share points across weapons, so you can create an overpowered weapon, and one with no power.
- A weapon that hits will always do at least 1 damage.
- Statistic Values:
  - 1 Hit Chance => 0.25 points
  - 1 Base Damage => 2 points
  - 1 Damage Dice Side => 1.5 points

### Credits:
#### ChatGPT (OpenAI)
- Created Room Descriptions (changed from original text generated)
- Assisted with minor bug fixes (unaware of where in code (not recorded))
#### Mum & Dad
- Testing
- Assisted in writing game instructions
### Jake Castle
- Testing:
  - Found a susceptible Int collector with an easily triggered InputMismatchException.
  - Found out that if you die, you continue to receive input requests.
### Updates Record
https://github.com/leepsym/y11p
