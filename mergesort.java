  
void merge(int a[], int beg, int mid, int end)    
{    
    int m, n, k;  
    int n1 = mid - beg + 1;    
    int n2 = end - mid;    
      
    int LeftArray[n1], RightArray[n2]; //temporary arrays  
      
    /* copy data to temp arrays */  
    for (int m = 0; m < n1; m++)    
    LeftArray[m] = a[beg + m];    
    for (int n = 0; n < n2; n++)    
    RightArray[j] = a[mid + 1 + n];    
      
    m = 0, /* initial index of first sub-array */  
    n = 0; /* initial index of second sub-array */   
    k = beg;  /* initial index of merged sub-array */  
      
    while (m< n1 && n < n2)    
    {    
        if(LeftArray[m] <= RightArray[n])    
        {    
            a[k] = LeftArray[m];    
            m++;    
        }    
        else    
        {    
            a[k] = RightArray[n];    
            n++;    
        }    
        k++;    
    }    
    while (m<n1)    
    {    
        a[k] = LeftArray[m];    
        m++;    
        k++;    
    }    
      
    while (n<n2)    
    {    
        a[k] = RightArray[n];    
        n++;    
        k++;    
    }    
}    
