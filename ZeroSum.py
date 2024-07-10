class ZeroSum:
    arr=[]
    n=int(input("Enter number of elements"))
    def accept(self):
        for i in range(0,self.n):
            self.arr.append(int(input()))
    
    def find(self):
        a=[]
        for i in range(0,self.n):
            for j in range(i+1,self.n+1):
                a=self.arr[i:j]
                if(sum(a)==0):
                    print(a)
    

o1 = ZeroSum()
o1.accept()
o1.find()