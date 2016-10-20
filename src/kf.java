final class kf {
	
	static int a;
	private static ob b;
	static ob c;
	static ob ob_d;
	static ob e = rf.a(40, "");
	static ob f;
	static ob g;
	static ob h;
	static ob i;
	static ob j;
	static ob k;
	static ob l;
	static int m;
	
	public static void a(byte var0) {
		try {
			ob_d = null;
			h = null;
			c = null;
			f = null;
			e = null;
			k = null;
			i = null;
			b = null;
			j = null;
			g = null;
			l = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "kf.C(" + var0 + ')');
		}
	}
	
	static void a(int unused, int id) {
		try {
			++a;
			ng class_ng = (ng) jg.a.a((long) id, 22346);
			if (class_ng != null) {
				int index = 0;
				while (~class_ng.q.length < ~index) {
					class_ng.q[index] = -1;
					class_ng.y[index] = 0;
					++index;
				}
				
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "kf.A(" + unused + ',' + id + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, aa var4, aa var5, int var6, int var7, long var8) {
		if (var4 != null || var5 != null) {
			rc var10 = new rc();
			var10.j = var8;
			var10.g = var1 * 128 + 64;
			var10.p = var2 * 128 + 64;
			var10.i = var3;
			var10.k = var4;
			var10.b = var5;
			var10.n = var6;
			var10.o = var7;
			
			for (int var11 = var0; var11 >= 0; --var11) {
				if (nb.oc[var11][var1][var2] == null) {
					nb.oc[var11][var1][var2] = new pd(var11, var1, var2);
				}
			}
			
			nb.oc[var0][var1][var2].x = var10;
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, og var6, int var7) {
		int var10 = client.anInt_wb;
		
		try {
			label108:
			{
				int var8;
				if (var2 < 0 || ~var2 <= -105 || var3 < 0 || ~var3 <= -105) {
					while (true) {
						var8 = var6.readUnsignedByte(255);
						if (var8 != 0) {
							if (~var8 == -2) {
								var6.readUnsignedByte(255);
								if (var10 == 0) {
									break label108;
								}
							}
							
							if (~var8 < -50) {
								continue;
							}
							
							var6.readUnsignedByte(255);
							if (var10 == 0) {
								continue;
							}
						}
						
						if (var10 == 0) {
							break label108;
						}
						break;
					}
				}
				
				qe.r[var4][var2][var3] = 0;
				
				label75:
				do {
					do {
						do {
							var8 = var6.readUnsignedByte(255);
							if (~var8 == -1) {
								if (~var4 != -1) {
									d.D[var4][var2][var3] = d.D[var4 + -1][var2][var3] - 240;
									if (var10 == 0) {
										break label75;
									}
								}
								
								d.D[0][var2][var3] = -ai.a(var5 + var3 + 556238, var0 + 932731 - -var2, (byte) -124) * 8;
								if (var10 == 0) {
									break label75;
								}
							}
							
							if (~var8 == -2) {
								int var9 = var6.readUnsignedByte(255);
								if (var9 == 1) {
									var9 = 0;
								}
								
								if (~var4 == -1) {
									d.D[0][var2][var3] = 8 * -var9;
									if (var10 == 0) {
										break label75;
									}
								}
								
								d.D[var4][var2][var3] = d.D[-1 + var4][var2][var3] + -(var9 * 8);
								if (var10 == 0) {
									break label75;
								}
							}
							
							if (~var8 < -50) {
								break;
							}
							
							tb.bytes_m[var4][var2][var3] = var6.readByte(1064893128);
							rg.C[var4][var2][var3] = (byte) ((var8 - 2) / 4);
							nc.h[var4][var2][var3] = (byte) bd.b(var7 + -2 + var8, 3);
						} while (var10 == 0);
						
						if (~var8 < -82) {
							break;
						}
						
						qe.r[var4][var2][var3] = (byte) (var8 - 49);
					} while (var10 == 0);
					
					li.g[var4][var2][var3] = (byte) (-81 + var8);
				} while (var10 == 0);
			}
			
			if (var1 <= 43) {
				a(29, 124);
			}
			
			++m;
		} catch (RuntimeException var11) {
			throw bc.a(var11, "kf.D(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + (var6 != null ? "{...}" : "null") + ',' + var7 + ')');
		}
	}
	
	static {
		j = e;
		i = e;
		f = e;
		ob_d = e;
		b = rf.a(40, "Too many connections from your address)3");
		h = b;
		k = rf.a(40, "Regeln versto-8en hat)3");
		g = rf.a(40, "Lade Benutzeroberfl-=che )2 ");
		c = e;
		l = e;
	}
}
