final class lf extends vd {
	
	fi o;
	int p;
	int q;
	id r;
	int s;
	int t;
	int u;
	static t v;
	static ob w = rf.a(40, " )2> ");
	static ob x = rf.a(40, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");
	static int[] y = new int[] {1, 1, 0, 0, 0, 8, 0, 0, 8};
	int z;
	int A;
	static int B;
	int C;
	int D;
	oa E;
	int F;
	int G;
	static int H;
	static int I;
	int J;
	static int K;
	td L;
	int M;
	int N;
	int P;
	int Q;
	int R;
	
	static void a(ra[] paramArrayOfra, int paramInt1, int paramInt2) {
		try {
			int i = 0;
			while (i < paramArrayOfra.length) {
				ra localra = paramArrayOfra[i];
				if ((localra != null) && ((~localra.Ic) == (~paramInt1)) && ((!localra.R) || (!bi.a((byte) -84, localra)))) {
					if (localra.Ac == 0) {
						if ((!localra.R) && (bi.a((byte) -125, localra)) && (localra != qh.a)) {
							break;
						}
						a(paramArrayOfra, localra.Ec, -127);
						if (localra.xb != null) {
							a(localra.xb, localra.Ec, -118);
						}
						re localre = (re) rd.J.a(localra.Ec, 22346);
						if (localre != null) {
							hf.b(localre.w, -104);
						}
					}
					if ((~localra.Ac) == -7) {
						int k;
						if (((~localra.nc) != 0) || ((~localra.anInt_wc) != 0)) {
							boolean bool = nf.a(localra, 0);
							if (!bool) {
								k = localra.nc;
							} else {
								k = localra.anInt_wc;
							}
							if ((~k) != 0) {
								ce localce = le.c(15619, k);
								if (localce != null) {
									localra.Fb += dc.k;
									while (localce.W[localra.Oc] < localra.Fb) {
										localra.Fb -= localce.W[localra.Oc];
										localra.Oc += 1;
										if ((~localra.Oc) <= (~localce.Z.length)) {
											localra.Oc -= localce.U;
											if (((~localra.Oc) > -1) || ((~localce.Z.length) >= (~localra.Oc))) {
												localra.Oc = 0;
											}
										}
										dg.a(localra, -124);
									}
								}
							}
						}
						if (((~localra.Lb) != -1) && (!localra.R)) {
							int j = localra.Lb >> 16;
							k = localra.Lb << 16 >> 16;
							k *= dc.k;
							j *= dc.k;
							localra.S = (k + localra.S & 0x7FF);
							localra.k = (localra.k + j & 0x7FF);
							dg.a(localra, -96);
						}
					}
				}
				i++;
			}
			if (paramInt2 > -113) {
				d(78);
			}
			H += 1;
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "lf.A(" + "{...}" + ',' + paramInt1 + ',' + paramInt2 + ')');
		}
		
	}
	
	static int d(int var0) {
		try {
			if (var0 < 55) {
				x = null;
			}
			
			++I;
			return h.ib;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "lf.E(" + var0 + ')');
		}
	}
	
	final void e(int var1) {
		try {
			++K;
			this.r = null;
			this.o = null;
			if (var1 > -27) {
				this.E = null;
			}
			
			this.L = null;
			this.E = null;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "lf.D(" + var1 + ')');
		}
	}
	
	public static void f(int var0) {
		try {
			if (var0 > -68) {
				d(67);
			}
			
			y = null;
			v = null;
			x = null;
			w = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "lf.C(" + var0 + ')');
		}
	}
	
	static fa a(boolean var0) {
		try {
			fa var1 = new fa();
			var1.R = wg.V[0];
			++B;
			var1.Q = ub.g[0];
			var1.P = ci.A[0];
			var1.N = le.db[0];
			var1.O = be.h;
			var1.L = ci.x[0];
			if (var0) {
				return null;
			} else {
				var1.M = tg.b;
				var1.K = kd.S;
				ii.e(-54);
				return var1;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "lf.B(" + var0 + ')');
		}
	}
}
