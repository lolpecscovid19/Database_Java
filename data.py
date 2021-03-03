from covid import Covid ##you should pip install covid.
covid = Covid()
data = covid.get_data()
f = open("data.txt","w")
for i in data:
    for k in i:
        f.write(str(k))
        f.write(":")
        f.write(str(i[k]))
        f.write('\t')
    f.write('\n')
    
    ## I will updata the GUI this weekend 