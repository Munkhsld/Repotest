//package lab1;
//
//    class Stack
//    {
//        private int count, size;
//        private int[] array;
//
//        public Stack(int n)
//        {
//            array = new int[n];
//            size = n;
//            count = 0;
//        }
//
//        public bool isFull()
//        {
//            return count == size;
//        }
//
//        public bool isEmpty()
//        {
//            return count == 0;
//        }
//
//        public void push(int value)
//        {
//            if (!isFull())
//            {
//                array[count++] = value; 
//            }
//        }
//s
//        public int pop()
//        {
//            if (!isEmpty())
//                return array[--count];
//            else
//                //return -1;
//            //return default(int);
//            throw new InvalidOperationException("Stack empty!");
//        }
//
//        public int top()
//        {
//            if (!isEmpty())
//                return array[count-1];
//            else
//                //return -1;
//                //return default(int);
//                throw new InvalidOperationException("Stack empty!");
//        }
//
//        public string toString()
//        {
//            string s = "";
//            for (int i = 0; i < count; i++)
//                s = s + array[i].ToString() + " ";
//
//            return s;
//        }
//    }
//
