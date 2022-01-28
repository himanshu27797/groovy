def name = "Kate"
def surname = "White"
def test = "aaaaa"
def value = 'Hello "World" '
def kate = "Hello $name $surname"

def getName(String name) {
    name
}

def getFromDb = """
SELECT *
FROM USERS
WHERE name = $name
AND surname = ${getName(surname)} 
"""

def getFrom = '''
SELECT *
FROM USERS
WHERE id=1
'''

def value2 = /Hello $name/
def value3 = $/Hello $name/$


println getFromDb
println getFrom
println value2
println value3
println name[-1] //1 from end
println name[2] //2 from start
println name[0..1] // from 1st to 2rd
println name - 'K'   // delete substring
println test - 'a'   // delete firstFind