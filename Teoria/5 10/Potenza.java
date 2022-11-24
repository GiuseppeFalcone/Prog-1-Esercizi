int n = -1;
int k;
int r;
r = calcoloRisultato(k);
calcoloRisultato(k) {
  int r;
  if (controlloPari(k)){
    r = 1;
  } else {
    r = -1;
  }
  return r;
}

controlloPari (k) {
  int x = k;
  while (x > 0) {
    x = x - 2;
  }
  if (x == 0){
    return true;
  } else {
    return false;
  }
}
