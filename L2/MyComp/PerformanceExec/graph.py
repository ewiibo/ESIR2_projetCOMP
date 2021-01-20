import matplotlib.pyplot as plt

taille = open("taille.txt", 'r')

tailleList = taille.readlines()
tailleList = [ int(x.replace('\n','')) for x in tailleList]

temps = open("temps.txt",'r')
tempsList = temps.readlines()
tempsList = [int(x.replace("\n",'')) for x in tempsList]

print(tailleList)
print(tempsList)

# create figure (will only create new window if needed)
plt.figure()
# Generate plot2
plt.plot(tailleList, tempsList, marker='o')
# Finally block main thread until all plots are closed
plt.show()

