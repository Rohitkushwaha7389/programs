import pandas
from matplotlib import pyplot as plt

data = pandas.read_csv("/content/titanic (1).csv")
survived = list(data['Survived'])
total = len(survived)
death = survived.count(0)
alive = total-death
per_death = (death/total)*150
per_alive = (alive/total)*150
status = ["death", "alive"]
per_data = [per_death, per_alive]
colors = ["#ff0000", "#ff3333"]

plt.pie(per_data, labels=status, colors=colors)
plt.title("Percatages of death and alive")
plt.legend()
plt.show()