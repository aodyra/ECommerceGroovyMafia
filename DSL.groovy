enum Task { design, testing, developing }
enum Day { sunday, monday, tuesday, wednesday, thursday, friday, saturday }
enum Method { ecash, echecks, ewallet }
enum Site { BukaLapak, Amazon, Tokopedia, Steam, Kaskus, Ebay, Google }

// Supporting class to save work item info.
class WorkItem {
  Task task
  Site site
  Integer hours
}

class TradeCar {
  Method method
  Site site
  Integer cars
}
 
class TradeIsland {
  Day day 
  Site site
  Integer islands
}
 
class TransferMillion {
  Method method
  Day day 
  Integer millions
}
 
// Support syntax 1.hour, 3.hours and so on.
Integer.metaClass.getHour = { -> delegate }
Integer.metaClass.getHours = { -> delegate }
Integer.metaClass.getCar = { -> delegate }
Integer.metaClass.getCars = { -> delegate }
Integer.metaClass.getIsland = { -> delegate }
Integer.metaClass.getIslands = { -> delegate }
Integer.metaClass.getMillion = { -> delegate }
Integer.metaClass.getMillions = { -> delegate }
 
// Import enum values as constants.
import static Task.*
import static Day.*
import static Method.*
import static Site.*
 
// List to save hours spent on tasks at
// different clients.
workList = []
carList = []
islandList = []
transferList = []
  
def worked(Integer hours) {
    ['on': { Task task ->
        ['at': { Site site ->
            workList << new WorkItem(task: task, site: site, hours: hours)
        }]
    }]
}
 
def developed(Integer hours) {
    ['at': { Site site ->
        workList << new WorkItem(task: developing, site: site, hours: hours)
    }]
}
 
def bought(Integer cars) {
  ['using': { Method method ->
      ['at': { Site site -> 
        carList << new TradeCar(method: method, site: site, cars: cars) 
      }]
  }]
}

def sold(Integer islands) {
  ['on': { Day day ->
    ['at': { Site site -> 
      islandList << new TradeIsland(day: day, site: site, islands: islands) 
    }]
  }]
}

def transferred(Integer millions) {
  ['using': { Method method ->
    ['on': { Day day ->
       transferList << new TransferMillion(method: method, day: day, millions: millions)
    }]
  }]
}

// DSL
worked 2.hours on design at Steam
worked 4.hours on testing at Kaskus
developed 3.hours at Ebay
developed 1.hour at Google
bought 12.cars using ewallet at BukaLapak
bought 2.cars using ecash at Tokopedia
sold 7.islands on tuesday at Amazon
sold 10.islands on saturday at BukaLapak
transferred 99.millions using ewallet on monday
transferred 27.millions using ecash on sunday
 
// Test if workList is filled with correct data
def total(condition) {
  workList.findAll(condition).sum { it.hours }
}
 
def total2(condition) {
  carList.findAll(condition).sum { it.cars }
}

def total3(condition) {
  islandList.findAll(condition).sum { it.islands }
}

def total4(condition) {
  transferList.findAll(condition).sum { it.millions }
}

assert total({ it.site == Steam }).hours == 2
assert total({ it.site == Kaskus }).hours == 4
assert total({ it.task == developing }).hours == 4
assert total({ it.task == design }).hours == 2
assert total({ it.task == testing }).hours == 4
assert total2({ it.site == BukaLapak }).cars == 12
assert total3({ it.site == Amazon }).islands == 7
assert total4({ it.day == sunday }).millions == 27
