main () {
  n = 7;
  s = 0;
  while (i < n){
    if (controlloPari (n)){
      s = somma(s, n);
      i = i + 1;
    }
  }
}

controlloPari (n) {
  if (n % 2 == 0) {
    p = true;
  }
  return p;
}

somma (s, n){
  s = s + n;
}
