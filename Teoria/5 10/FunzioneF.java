int n;
int k;
int z;
int s = 0;
primaSommatoria (n, k, z){
  while (k < (2 * n)){
    s = s + (primaParentesi(k) * secondaParentesi(z, n));
  }
  return s;
}

primaParentesi (k) {
  int r = ((menoUno(k))/((2 * k) + 1));
  return r;
}

menoUno (k) {
  int x = k;
  int x = k;
  while (x > 0) {
    x = x - 2;
  }
  if (x == 0){
    return 1;
  } else {
    return -1;
  }
}

secondaParentesi (z, n) {
  int r = ((calcoloPotenza(z, n)) / ((4 * n) + 2));
  return r;
}

calcoloPotenza (z, n) {
  int p = (4 * n) + 2;
  int r = z;
  while (i < p) {
    r = r + z;
  }
  return r;
}
