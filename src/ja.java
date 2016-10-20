import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class ja {
	
	private byte[] bytes_a;
	static volatile int b = 0;
	static int c;
	static ob d = rf.a(40, "Ein kostenloses Spielkonto erstellen)3");
	static int anInt_e;
	private long f;
	static int g;
	private int anInt_h;
	private long i = -1L;
	static int[] j;
	private long k = -1L;
	static int anInt_l;
	static int m;
	static int n;
	static int o;
	private byte[] bytes_p;
	static int q;
	static int r;
	static int s;
	static int t;
	static int u = 0;
	static int v;
	static int w;
	private gd x;
	static ob titlebox = rf.a(40, "titlebox");
	static int z = 0;
	static int A;
	private int B = 0;
	static int[] C = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179};
	private long D;
	static int E;
	private long F;
	private long G;
	
	final void a(int var1) throws IOException {
		try {
			this.b((byte) -46);
			if (var1 != 244) {
				r = 71;
			}
			
			++q;
			this.x.b((byte) 72);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ja.F(" + var1 + ')');
		}
	}
	
	static int a(ob var0, int var1) {
		try {
			++anInt_l;
			return oh.M == 1 ? 7 : (var0.a((int) 89, client.T) ? 1 : (var0.a((int) 102, e.ob_n) ? 1 : (var0.a((int) 118, vd.ob_g) ? 2 : (var1 != 3379 ? -37 : (var0.a(var1 ^ -3447, ee.ob_b) ? 2 : (var0.a((int) 123, bh.g) ? 3 : (var0.a((int) 113, ca.ams) ? 4 : (var0.a((int) 124, hi.ob_a) ? 4 : (var0.a(var1 + -3478, ae.swe) ? 5 : (var0.a(var1 + -3472, ih.g) ? 6 : 0))))))))));
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ja.G(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	final void a(byte[] var1, int var2, int var3, int var4) throws IOException {
		int var10 = client.anInt_wb;
		
		try {
			++s;
			
			try {
				if (~(this.G - -((long) var4)) < ~this.F) {
					this.F = this.G - -((long) var4);
				}
				
				if (this.i != -1L && (~this.G > ~this.i || this.G > this.i + (long) this.B)) {
					this.b((byte) -101);
				}
				
				if (~this.i != 0L && ~((long) var4 + this.G) < ~(this.i + (long) this.bytes_p.length)) {
					int var5 = (int) (this.i - this.G + (long) this.bytes_p.length);
					p.arrayCopy(var1, var3, this.bytes_p, (int) (this.G + -this.i), var5);
					this.G += (long) var5;
					var3 += var5;
					var4 -= var5;
					this.B = this.bytes_p.length;
					this.b((byte) 92);
				}
				
				if (var4 <= this.bytes_p.length) {
					if (var2 != -3818) {
						d((byte) -45);
					}
					
					if (~var4 < -1) {
						if (~this.i == 0L) {
							this.i = this.G;
						}
						
						p.arrayCopy(var1, var3, this.bytes_p, (int) (-this.i + this.G), var4);
						this.G += (long) var4;
						if ((long) this.B < -this.i + this.G) {
							this.B = (int) (this.G - this.i);
						}
						
					}
				} else {
					long var7 = -1L;
					if (this.G != this.f) {
						this.x.a((byte) -93, this.G);
						this.f = this.G;
					}
					
					long var13 = -1L;
					this.x.a(var4, var3, var1, 1);
					this.f += (long) var4;
					if (~this.f < ~this.D) {
						this.D = this.f;
					}
					
					label118:
					{
						if (this.k > this.G || this.G >= (long) this.anInt_h + this.k) {
							if (this.G > this.k || this.G - -((long) var4) <= this.k) {
								break label118;
							}
							
							var13 = this.k;
							if (var10 == 0) {
								break label118;
							}
						}
						
						var13 = this.G;
					}
					
					label78:
					{
						if (~(this.G + (long) var4) < ~this.k && this.G + (long) var4 <= this.k - -((long) this.anInt_h)) {
							var7 = this.G - -((long) var4);
							if (var10 == 0) {
								break label78;
							}
						}
						
						if (~(this.k + (long) this.anInt_h) < ~this.G && ~((long) var4 + this.G) <= ~(this.k + (long) this.anInt_h)) {
							var7 = (long) this.anInt_h + this.k;
						}
					}
					
					if (var13 > -1L && var13 < var7) {
						int var9 = (int) (-var13 + var7);
						p.arrayCopy(var1, (int) (var13 + ((long) var3 - this.G)), this.bytes_a, (int) (var13 - this.k), var9);
					}
					
					this.G += (long) var4;
				}
			} catch (IOException var11) {
				this.f = -1L;
				throw var11;
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "ja.P(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	public static void a(byte var0) {
		try {
			if (var0 > 45) {
				C = null;
				j = null;
				titlebox = null;
				d = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ja.N(" + var0 + ')');
		}
	}
	
	private void b(byte var1) throws IOException {
		int var8 = client.anInt_wb;
		
		try {
			if (~this.i != 0L) {
				if (~this.f != ~this.i) {
					this.x.a((byte) -44, this.i);
					this.f = this.i;
				}
				
				long var3;
				label55:
				{
					var3 = -1L;
					this.x.a(this.B, 0, this.bytes_p, 1);
					if (~this.k >= ~this.i && ~this.i > ~(this.k + (long) this.anInt_h)) {
						var3 = this.i;
						if (var8 == 0) {
							break label55;
						}
					}
					
					if (~this.i >= ~this.k && ~this.k > ~(this.i + (long) this.B)) {
						var3 = this.k;
					}
				}
				
				long var5;
				label65:
				{
					var5 = -1L;
					if (~this.k <= ~(this.i + (long) this.B) || (long) this.anInt_h + this.k < this.i - -((long) this.B)) {
						if (this.i >= (long) this.anInt_h + this.k || ~((long) this.anInt_h + this.k) < ~((long) this.B + this.i)) {
							break label65;
						}
						
						var5 = (long) this.anInt_h + this.k;
						if (var8 == 0) {
							break label65;
						}
					}
					
					var5 = (long) this.B + this.i;
				}
				
				this.f += (long) this.B;
				if (this.f > this.D) {
					this.D = this.f;
				}
				
				if (var3 > -1L && var5 > var3) {
					int var7 = (int) (var5 - var3);
					p.arrayCopy(this.bytes_p, (int) (var3 + -this.i), this.bytes_a, (int) (var3 + -this.k), var7);
				}
				
				this.i = -1L;
				this.B = 0;
			}
			
			++c;
		} catch (RuntimeException var9) {
			throw bc.a(var9, "ja.A(" + var1 + ')');
		}
	}
	
	final void a(int var1, byte[] var2, int var3, int var4) throws IOException {
		int var14 = client.anInt_wb;
		
		try {
			++o;
			
			try {
				if (~var2.length > ~(var3 + var1)) {
					throw new ArrayIndexOutOfBoundsException(var1 - -var3 - var2.length);
				}
				
				if (~this.i != 0L && ~this.i >= ~this.G && (long) var3 + this.G <= (long) this.B + this.i) {
					p.arrayCopy(this.bytes_p, (int) (this.G - this.i), var2, var1, var3);
					this.G += (long) var3;
					return;
				}
				
				long var5 = this.G;
				if (var4 != 5) {
					C = null;
				}
				
				int var8 = var3;
				int var9;
				if (~this.G <= ~this.k && this.G < (long) this.anInt_h + this.k) {
					var9 = (int) ((long) this.anInt_h + (-this.G - -this.k));
					if (var9 > var3) {
						var9 = var3;
					}
					
					var3 -= var9;
					p.arrayCopy(this.bytes_a, (int) (-this.k + this.G), var2, var1, var9);
					var1 += var9;
					this.G += (long) var9;
				}
				
				label148:
				{
					if (var3 > this.bytes_a.length) {
						this.x.a((byte) 117, this.G);
						this.f = this.G;
						if (/*var14 != 0 || */~var3 < -1) {
							do {
								var9 = this.x.a(var2, var1, var3, 0);
								if (~var9 == 0) {
									break;
								}
								
								var3 -= var9;
								this.f += (long) var9;
								this.G += (long) var9;
								var1 += var9;
							} while (~var3 < -1);
						}
					}
					
					if (var3 > 0) {
						this.e((byte) 108);
						var9 = var3;
						if (~var3 < ~this.anInt_h) {
							var9 = this.anInt_h;
						}
						
						p.arrayCopy((byte[]) this.bytes_a, 0, (byte[]) var2, var1, var9);
						var1 += var9;
						var3 -= var9;
						this.G += (long) var9;
					}
				}
				
				if (~this.i != 0L) {
					if (~this.G > ~this.i && ~var3 < -1) {
						label163:
						{
							var9 = var1 + (int) (this.i + -this.G);
							if (var1 + var3 < var9) {
								var9 = var1 - -var3;
								if (/*var14 == 0 && */var1 >= var9) {
									break label163;
								}
							} else if (var1 >= var9) {
								break label163;
							}
							
							do {
								var2[var1++] = 0;
								++this.G;
								--var3;
							} while (var1 < var9);
						}
					}
					
					long var17;
					label101:
					{
						var17 = -1L;
						if (~this.i <= ~var5 && ~this.i > ~(var5 - -((long) var8))) {
							var17 = this.i;
						}
						
						if (~this.i >= ~var5 && ~var5 > ~((long) this.B + this.i)) {
							var17 = var5;
						}
					}
					
					long var11;
					label170:
					{
						var11 = -1L;
						if (var5 >= this.i - -((long) this.B) || ~(var5 - -((long) var8)) > ~((long) this.B + this.i)) {
							if (~this.i <= ~(var5 - -((long) var8)) || this.i - -((long) this.B) < (long) var8 + var5) {
								break label170;
							}
							
							var11 = var5 + (long) var8;
						} else {
							var11 = (long) this.B + this.i;
						}
					}
					
					if (var17 > -1L && var17 < var11) {
						int var13 = (int) (-var17 + var11);
						p.arrayCopy(this.bytes_p, (int) (-this.i + var17), var2, var1 - -((int) (var17 + -var5)), var13);
						if (~var11 < ~this.G) {
							var3 = (int) ((long) var3 - (-this.G + var11));
							this.G = var11;
						}
					}
				}
			} catch (IOException var15) {
				this.f = -1L;
				throw var15;
			}
			
			if (var3 > 0) {
				throw new EOFException();
			}
		} catch (RuntimeException var16) {
			throw bc.a(var16, "ja.H(" + var1 + ',' + "{...}" + ',' + var3 + ',' + var4 + ')');
		}
	}
	
	final void a(int var1, byte[] var2) throws IOException {
		try {
			this.a(0, var2, var2.length, 5);
			++w;
			if (var1 < 101) {
				this.i = 45L;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ja.I(" + var1 + ',' + "{...}" + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, ra[] var5, int var6, int var7, int var8, int var9) {
		int var41 = client.anInt_wb;
		
		try {
			oi.b(var2, var9, var0, var1);
			ec.e();
			if (var8 != 16) {
				a((byte) 50);
			}
			
			++g;
			int var10 = 0;
			if (var41 != 0 || ~var5.length < ~var10) {
				do {
					ra var11 = var5[var10];
					if (var11 != null && (var4 == var11.Ic || ~var4 == 1412584498 && (var11 == gf.u || var41 != 0))) {
						label989:
						{
							int var12;
							if (~var3 == 0) {
								df.v[e.anInt_d] = var6 + var11.Nb;
								be.f[e.anInt_d] = var11.gc + var7;
								l.o[e.anInt_d] = var11.L;
								ki.r[e.anInt_d] = var11.w;
								var12 = e.anInt_d++;
								if (var41 != 0) {
									var12 = var3;
								}
							} else {
								var12 = var3;
							}
							
							var11.vc = var12;
							var11.x = bi.f;
							if (var11.R) {
								if (bi.a((byte) -108, var11)) {
									break label989;
								}
								
								if (~var11.ab < -1) {
									fh.a(var11, (byte) 48);
								}
							} else if (~var11.ab < -1) {
								fh.a(var11, (byte) 48);
							}
							
							int var14 = var11.gc - -var7;
							int var13 = var6 + var11.Nb;
							int var15 = var11.kb;
							int var16;
							int var17;
							if (var11 == gf.u) {
								if (~var4 != 1412584498 && !var11.aBoolean_qc) {
									ld.w = var7;
									wf.n = var5;
									lb.Z = var6;
									if (var41 == 0) {
										break label989;
									}
								}
								
								if (!var11.aBoolean_qc) {
									var15 = 128;
								}
								
								if (uc.pb && la.y) {
									var16 = og.o;
									var16 -= vd.k;
									var17 = re.u;
									if (~var16 > ~ug.s) {
										var16 = ug.s;
									}
									
									if (~(var11.L + var16) < ~(ue.ib.L + ug.s)) {
										var16 = -var11.L + ue.ib.L + ug.s;
									}
									
									var13 = var16;
									var17 -= tf.h;
									if (~var17 > ~qc.q) {
										var17 = qc.q;
									}
									
									if (~(qc.q - -ue.ib.w) > ~(var11.w + var17)) {
										var17 = -var11.w + qc.q + ue.ib.w;
									}
									
									var14 = var17;
								}
							}
							
							int var18;
							int var19;
							int var20;
							int var21;
							int var22;
							int var23;
							label913:
							{
								if (~var11.Ac == -3) {
									var17 = var9;
									var19 = var1;
									var18 = var0;
									var16 = var2;
									if (var41 == 0) {
										break label913;
									}
								}
								
								if (~var11.Ac != -10) {
									var16 = var13 <= var2 ? var2 : var13;
									var17 = var14 > var9 ? var14 : var9;
									var20 = var13 + var11.L;
									var18 = var20 >= var0 ? var0 : var20;
									var21 = var11.w + var14;
									var19 = ~var21 > ~var1 ? var21 : var1;
									if (var41 == 0) {
										break label913;
									}
								}
								
								var20 = var13;
								var21 = var14;
								var22 = var13 + var11.L;
								if (~var22 > ~var13) {
									var20 = var22;
									var22 = var13;
								}
								
								var23 = var14 + var11.w;
								if (~var14 < ~var23) {
									var21 = var23;
									var23 = var14;
								}
								
								++var22;
								var17 = ~var21 < ~var9 ? var21 : var9;
								++var23;
								var16 = var2 >= var20 ? var2 : var20;
								var19 = var23 >= var1 ? var1 : var23;
								var18 = ~var22 > ~var0 ? var22 : var0;
							}
							
							if (!var11.R || ~var16 > ~var18 && (var19 > var17 || var41 != 0)) {
								label990:
								{
									if (~var11.ab != -1) {
										if (~var11.ab == -1338) {
											ob.U = var13;
											rf.y = var14;
											tf.a((byte) 121, var11.L, var13, var11.w, var14);
											oi.b(var2, var9, var0, var1);
											if (var41 == 0) {
												break label990;
											}
										}
										
										if (~var11.ab == -1339) {
											if (!var11.b(0)) {
												break label990;
											}
											
											a.a(var8 ^ 20, var12, var11, var14, var13);
											oi.b(var2, var9, var0, var1);
											if (var41 == 0) {
												break label990;
											}
										}
										
										if (~var11.ab == -1340) {
											if (!var11.b(0)) {
												break label990;
											}
											
											ee.a(var12, var13, (byte) -9, var14, var11);
											oi.b(var2, var9, var0, var1);
											if (var41 == 0) {
												break label990;
											}
										}
									}
									
									var20 = og.o;
									var21 = re.u;
									if (!le.X && var16 <= var20 && ~var17 >= ~var21 && var18 > var20 && var19 > var21) {
										ed.a(var11, (byte) 119, -var14 + var21, var20 + -var13);
									}
									
									if (var11.Ac == 0) {
										if (!var11.R && bi.a((byte) -36, var11) && qh.a != var11) {
											break label990;
										}
										
										if (!var11.R) {
											if (~var11.rc < ~(var11.anInt_cb + -var11.w)) {
												var11.rc = -var11.w + var11.anInt_cb;
											}
											
											if (~var11.rc > -1) {
												var11.rc = 0;
											}
										}
										
										a(var18, var19, var16, var12, var11.Ec, var5, var13 - var11.Gb, var14 - var11.rc, 16, var17);
										if (var11.xb != null) {
											a(var18, var19, var16, var12, var11.Ec, var11.xb, var13 - var11.Gb, var14 + -var11.rc, var8, var17);
										}
										
										re var43 = (re) rd.J.a((long) var11.Ec, 22346);
										if (var43 != null) {
											if (~var43.B == -1 && ~og.o <= ~var16 && var17 <= re.u && ~og.o > ~var18 && ~re.u > ~var19 && !le.X && !jh.j) {
												si.S = 1;
												ca.Nb[0] = ea.cancel2;
												ph.i[0] = 1006;
												wf.e[0] = lb.T;
											}
											
											be.a(var16, var12, -127, var14, var18, var43.w, var19, var17, var13);
										}
										
										oi.b(var2, var9, var0, var1);
										ec.e();
									}
									
									if (tf.q[var12] || ~rg.anInt_v < -2) {
										if (var11.Ac == 0 && !var11.R && var11.anInt_cb > var11.w) {
											qh.a(var11.w, var14, var11.rc, var11.L + var13, var11.anInt_cb, 18768);
										}
										
										if (var11.Ac != 1) {
											label960:
											{
												int var24;
												int var25;
												int var26;
												int var29;
												int var32;
												int var33;
												int var34;
												int var49;
												int var51;
												if (var11.Ac == 2) {
													var22 = 0;
													var23 = 0;
													if (var41 != 0 || ~var23 > ~var11.w) {
														do {
															var24 = 0;
															if (var41 != 0 || ~var11.L < ~var24) {
																do {
																	label997:
																	{
																		var26 = var14 + var23 * (32 + var11.hb);
																		var25 = (var11.Ab + 32) * var24 + var13;
																		if (~var22 > -21) {
																			var26 += var11.d[var22];
																			var25 += var11.m[var22];
																		}
																		
																		if (var11.ints_tc[var22] <= 0) {
																			if (var11.qb == null || ~var22 <= -21) {
																				break label997;
																			}
																			
																			kc var27 = var11.a(-59, var22);
																			if (var27 == null) {
																				if (!sa.b) {
																					break label997;
																				}
																				
																				dg.a(var11, -104);
																				if (var41 == 0) {
																					break label997;
																				}
																			}
																			
																			var27.c(var25, var26);
																			if (var41 == 0) {
																				break label997;
																			}
																		}
																		
																		boolean var28 = false;
																		boolean var47 = false;
																		var29 = var11.ints_tc[var22] - 1;
																		if (~(32 + var25) < ~var2 && ~var25 > ~var0 && var9 < var26 + 32 && var1 > var26 || var11 == og.ub && var22 == re.G) {
																			kc var30;
																			label998:
																			{
																				if (ch.cb != 1 || ~ae.Mb != ~var22 || ~var11.Ec != ~be.b) {
																					var30 = ie.a(1, false, var29, -118, var11.fb[var22], 3153952);
																					if (var41 == 0) {
																						break label998;
																					}
																				}
																				
																				var30 = ie.a(2, false, var29, -70, var11.fb[var22], 0);
																			}
																			
																			if (var30 == null) {
																				dg.a(var11, var8 ^ -69);
																			} else {
																				label999:
																				{
																					if (og.ub != var11 || ~var22 != ~re.G) {
																						if (var11 == tb.l && ~bf.W == ~var22) {
																							var30.b(var25, var26, 128);
																							if (var41 == 0) {
																								break label999;
																							}
																						}
																						
																						var30.c(var25, var26);
																						if (var41 == 0) {
																							break label999;
																						}
																					}
																					
																					var51 = -id.s + re.u;
																					var49 = -ee.m + og.o;
																					if (~var51 > -6 && ~var51 < 4) {
																						var51 = 0;
																					}
																					
																					if (var49 < 5 && var49 > -5) {
																						var49 = 0;
																					}
																					
																					if (~bd.I > -6) {
																						var51 = 0;
																						var49 = 0;
																					}
																					
																					var30.b(var49 + var25, var26 - -var51, 128);
																					if (var4 != -1) {
																						ra var31 = var5['\uffff' & var4];
																						var33 = oi.I;
																						var32 = oi.F;
																						if (~(var26 + var51) > ~var32 && var31.rc > 0) {
																							var34 = dc.k * (-var51 + -var26 + var32) / 3;
																							if (var34 > 10 * dc.k) {
																								var34 = dc.k * 10;
																							}
																							
																							if (var31.rc < var34) {
																								var34 = var31.rc;
																							}
																							
																							id.s += var34;
																							var31.rc -= var34;
																							dg.a(var31, -92);
																						}
																						
																						if (var51 + var26 - -32 > var33 && ~(-var31.w + var31.anInt_cb) < ~var31.rc) {
																							var34 = dc.k * (-var33 + 32 + var26 - -var51) / 3;
																							if (~var34 < ~(10 * dc.k)) {
																								var34 = 10 * dc.k;
																							}
																							
																							if (~(-var31.rc + var31.anInt_cb - var31.w) > ~var34) {
																								var34 = -var31.rc + -var31.w + var31.anInt_cb;
																							}
																							
																							var31.rc += var34;
																							id.s -= var34;
																							dg.a(var31, var8 + -142);
																							if (var41 != 0) {
																								dg.a(var11, var8 ^ -69);
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																	
																	++var22;
																	++var24;
																} while (~var11.L < ~var24);
															}
															
															++var23;
														} while (~var23 > ~var11.w);
													}
													
													if (var41 == 0) {
														break label960;
													}
												}
												
												if (~var11.Ac == -4) {
													label809:
													{
														if (!nf.a(var11, 0)) {
															var22 = var11.N;
															if (qh.a != var11 || ~var11.Kb == -1) {
																break label809;
															}
															
															var22 = var11.Kb;
															if (var41 == 0) {
																break label809;
															}
														}
														
														var22 = var11.anInt_t;
														if (qh.a == var11 && ~var11.K != -1) {
															var22 = var11.K;
														}
													}
													
													if (var15 == 0) {
														if (var11.eb) {
															oi.d(var13, var14, var11.L, var11.w, var22);
															if (var41 == 0) {
																break label960;
															}
														}
														
														oi.a(var13, var14, var11.L, var11.w, var22);
														if (var41 == 0) {
															break label960;
														}
													}
													
													if (var11.eb) {
														oi.c(var13, var14, var11.L, var11.w, var22, 256 + -(255 & var15));
														if (var41 == 0) {
															break label960;
														}
													}
													
													oi.b(var13, var14, var11.L, var11.w, var22, -(var15 & 255) + 256);
													if (var41 == 0) {
														break label960;
													}
												}
												
												i var46;
												if (~var11.Ac == -5) {
													var46 = var11.a(var8 ^ 17, ca.gb);
													if (var46 == null) {
														if (!sa.b) {
															break label960;
														}
														
														dg.a(var11, -83);
														if (var41 == 0) {
															break label960;
														}
													}
													
													ob var44;
													label797:
													{
														var44 = var11.ob_lb;
														if (nf.a(var11, 0)) {
															var23 = var11.anInt_t;
															if (var11 == qh.a && var11.K != 0) {
																var23 = var11.K;
															}
															
															if (var11.T.a(false) <= 0) {
																break label797;
															}
															
															var44 = var11.T;
															if (var41 == 0) {
																break label797;
															}
														}
														
														var23 = var11.N;
														if (qh.a == var11 && var11.Kb != 0) {
															var23 = var11.Kb;
														}
													}
													
													if (var11.R && var11.Tb != -1) {
														ei var45 = jg.a((byte) -61, var11.Tb);
														var44 = var45.name;
														if (var44 == null) {
															var44 = wg.jb;
														}
														
														if ((var45.X == 1 || var11.Kc != 1) && ~var11.Kc != 0) {
															var44 = wc.a(new ob[] {le.cb, var44, jd.d, wb.c(84, var11.Kc)}, -3);
														}
													}
													
													if (sb.Z == var11) {
														var23 = var11.N;
														var44 = hf.x;
													}
													
													if (!var11.R) {
														var44 = ci.a(var8 + -93, var44, var11);
													}
													
													var46.a(var44, var13, var14, var11.L, var11.w, var23, !var11.a ? -1 : 0, var11.J, var11.yb, var11.anInt_e);
													if (var41 == 0) {
														break label960;
													}
												}
												
												if (~var11.Ac == -6) {
													kc var48;
													if (!var11.R) {
														var48 = var11.a(nf.a(var11, 0), (byte) -96);
														if (var48 == null) {
															if (!sa.b) {
																break label960;
															}
															
															dg.a(var11, -119);
															if (var41 == 0) {
																break label960;
															}
														}
														
														var48.c(var13, var14);
														if (var41 == 0) {
															break label960;
														}
													}
													
													if (~var11.Tb != 0) {
														var48 = ie.a(var11.ac, false, var11.Tb, -50, var11.Kc, var11.q);
														if (var41 != 0) {
															var48 = var11.a(false, (byte) -96);
														}
													} else {
														var48 = var11.a(false, (byte) -96);
													}
													
													if (var48 == null) {
														if (!sa.b) {
															break label960;
														}
														
														dg.a(var11, -92);
														if (var41 == 0) {
															break label960;
														}
													}
													
													var24 = var48.height;
													var23 = var48.width;
													if (var11.aBoolean_r) {
														oi.e(var13, var14, var13 - -var11.L, var11.w + var14);
														var25 = (var23 - 1 + var11.L) / var23;
														var26 = (-1 - (-var24 - var11.w)) / var24;
														var49 = 0;
														if (var41 == 0 && var49 >= var25) {
															oi.b(var2, var9, var0, var1);
															if (var41 == 0) {
																break label960;
															}
														} else {
															while (true) {
																var51 = 0;
																if (var41 != 0 || ~var51 > ~var26) {
																	do {
																		if (~var11.Y != -1) {
																			var48.g(var49 * var23 + var13 + var23 / 2, var24 / 2 + var14 - -(var24 * var51), var11.Y, 4096);
																			if (var41 == 0) {
																				++var51;
																				continue;
																			}
																		}
																		
																		if (var15 != 0) {
																			var48.b(var13 + var49 * var23, var14 - -(var51 * var24), -(255 & var15) + 256);
																			if (var41 != 0) {
																				var48.c(var13 - -(var23 * var49), var24 * var51 + var14);
																				++var51;
																			} else {
																				++var51;
																			}
																		} else {
																			var48.c(var13 - -(var23 * var49), var24 * var51 + var14);
																			++var51;
																		}
																	} while (~var51 > ~var26);
																}
																
																++var49;
																if (var49 >= var25) {
																	oi.b(var2, var9, var0, var1);
																	if (var41 == 0) {
																		break label960;
																	}
																	break;
																}
															}
														}
													}
													
													var25 = 4096 * var11.L / var23;
													if (~var11.Y != -1) {
														var48.g(var11.L / 2 + var13, var14 - -(var11.w / 2), var11.Y, var25);
														if (var41 == 0) {
															break label960;
														}
													}
													
													if (var15 != 0) {
														var48.f(var13, var14, var11.L, var11.w, 256 - (var15 & 255));
														if (var41 == 0) {
															break label960;
														}
													}
													
													if (~var23 == ~var11.L && var11.w == var24) {
														var48.c(var13, var14);
														if (var41 == 0) {
															break label960;
														}
													}
													
													var48.f(var13, var14, var11.L, var11.w);
													if (var41 == 0) {
														break label960;
													}
												}
												
												ei var54;
												if (~var11.Ac == -7) {
													boolean var53 = nf.a(var11, 0);
													if (var53) {
														var23 = var11.anInt_wc;
														if (var41 != 0) {
															var23 = var11.nc;
														}
													} else {
														var23 = var11.nc;
													}
													
													fe var50 = null;
													var25 = 0;
													if (~var11.Tb == 0) {
														if (~var11.bb == -6) {
															if (~var11.nb == 0) {
																var50 = oe.g.a(true, -1, -1, (ce) null, (ce) null);
															} else {
																var26 = 2047 & var11.nb;
																if (jh.c == var26) {
																	var26 = 2047;
																}
																
																dg var55 = lg.j[var26];
																ce var62 = var23 != -1 ? le.c(var8 + 15603, var23) : null;
																if (var55 != null && (int) var55.Ic.e((int) 19790) << 11 == (-2048 & var11.nb)) {
																	var50 = var55.Ac.a(true, var11.Oc, 0, (ce) null, var62);
																}
															}
														} else if (~var23 == 0) {
															var50 = var11.a(var53, true, -1, (ce) null, le.T.Ac);
															if (var50 == null && sa.b) {
																dg.a(var11, -123);
															}
														} else {
															ce var52 = le.c(var8 ^ 15635, var23);
															var50 = var11.a(var53, true, var11.Oc, var52, le.T.Ac);
															if (var50 == null && sa.b) {
																dg.a(var11, var8 ^ -96);
															}
														}
													} else {
														var54 = jg.a((byte) -61, var11.Tb);
														if (var54 != null) {
															var54 = var54.c(var11.Kc, -87);
															var50 = var54.a(var8 + -141, (ce) null, 1, 0);
															if (var50 != null) {
																var25 = -var50.b() / 2;
																if (var41 != 0) {
																	dg.a(var11, -91);
																}
															} else {
																dg.a(var11, -91);
															}
														}
													}
													
													if (var50 == null) {
														break label960;
													}
													
													label734:
													{
														ec.d(var13 - -(var11.L / 2) - -var11.Xb, var11.Ob + var14 + var11.w / 2);
														var26 = ec.W[var11.k] * var11.C >> 16;
														var49 = var11.C * ec.L[var11.k] >> 16;
														if (var11.R) {
															if (var11.h) {
																var50.a(0, var11.S, var11.pc, var11.k, var11.jb, var11.Nc + var25 + var26, var11.Nc + var49, var11.C);
																if (var41 == 0) {
																	break label734;
																}
															}
															
															var50.a(0, var11.S, var11.pc, var11.k, var11.jb, var26 + (var25 - -var11.Nc), var11.Nc + var49);
															if (var41 == 0) {
																break label734;
															}
														}
														
														var50.a(0, var11.S, 0, var11.k, 0, var26, var49);
													}
													
													ec.d();
													if (var41 == 0) {
														break label960;
													}
												}
												
												if (~var11.Ac == -8) {
													var46 = var11.a(1, (fa[]) ca.gb);
													if (var46 == null) {
														if (!sa.b) {
															break label960;
														}
														
														dg.a(var11, -94);
														if (var41 == 0) {
															break label960;
														}
													}
													
													var23 = 0;
													var24 = 0;
													if (var41 != 0 || var11.w > var24) {
														do {
															var25 = 0;
															if (var41 != 0 || ~var11.L < ~var25) {
																do {
																	if (var11.ints_tc[var23] <= 0) {
																		++var23;
																		++var25;
																	} else {
																		var54 = jg.a((byte) -61, var11.ints_tc[var23] - 1);
																		ob var57;
																		if (~var54.X != -2 && var11.fb[var23] == 1) {
																			var57 = wc.a(new ob[] {le.cb, var54.name, sf.b}, var8 ^ -19);
																		} else {
																			var57 = wc.a(new ob[] {le.cb, var54.name, jd.d, wb.c(104, var11.fb[var23])}, -3);
																			if (var41 != 0) {
																				var57 = wc.a(new ob[] {le.cb, var54.name, sf.b}, var8 ^ -19);
																			}
																		}
																		
																		var29 = var14 - -((var11.hb + 12) * var24);
																		var51 = var25 * (var11.Ab + 115) + var13;
																		if (~var11.J != -1) {
																			if (var11.J != 1) {
																				var46.c(var57, -1 + var11.L + var51, var29, var11.N, var11.a ? 0 : -1);
																				if (var41 == 0) {
																					++var23;
																					++var25;
																					continue;
																				}
																			}
																			
																			var46.b(var57, var51 + var11.L / 2, var29, var11.N, var11.a ? 0 : -1);
																			if (var41 != 0) {
																				var46.a(var57, var51, var29, var11.N, !var11.a ? -1 : 0);
																				++var23;
																				++var25;
																			} else {
																				++var23;
																				++var25;
																			}
																		} else {
																			var46.a(var57, var51, var29, var11.N, !var11.a ? -1 : 0);
																			++var23;
																			++var25;
																		}
																	}
																} while (~var11.L < ~var25);
															}
															
															++var24;
														} while (var11.w > var24);
													}
												}
												
												int var59;
												if (var11.Ac == 8 && be.j == var11 && ~ig.j == ~wb.X) {
													var22 = 0;
													var23 = 0;
													i var60 = mf.i_gb;
													ob var58 = var11.ob_lb;
													var58 = ci.a(-69, var58, var11);
													ob var56;
													if (var41 != 0 || ~var58.a(false) < -1) {
														do {
															var49 = var58.b((ob) h.gb, (byte) 121);
															if (~var49 != 0) {
																var56 = var58.a(var49, 0, (byte) 105);
																var58 = var58.a((byte) 103, (int) (4 + var49));
																if (var41 != 0) {
																	var56 = var58;
																	var58 = lb.T;
																}
															} else {
																var56 = var58;
																var58 = lb.T;
															}
															
															var51 = var60.b(var56);
															var23 += var60.bb - -1;
															if (~var51 < ~var22) {
																var22 = var51;
															}
														} while (~var58.a(false) < -1);
													}
													
													var22 += 6;
													var23 += 7;
													var51 = 5 + var11.w + var14;
													var49 = -5 + (var13 - -var11.L - var22);
													if (var13 + 5 > var49) {
														var49 = var13 - -5;
													}
													
													if (var1 < var23 + var51) {
														var51 = var1 + -var23;
													}
													
													if (~(var49 + var22) < ~var0) {
														var49 = -var22 + var0;
													}
													
													oi.d(var49, var51, var22, var23, 16777120);
													oi.a(var49, var51, var22, var23, 0);
													var29 = 2 + var60.bb + var51;
													var58 = var11.ob_lb;
													var58 = ci.a(var8 + -105, var58, var11);
													if (var41 != 0 || var58.a(false) > 0) {
														do {
															var59 = var58.b((ob) h.gb, (byte) 123);
															if (~var59 != 0) {
																var56 = var58.a(var59, 0, (byte) 19);
																var58 = var58.a((byte) -111, 4 + var59);
																if (var41 != 0) {
																	var56 = var58;
																	var58 = lb.T;
																}
															} else {
																var56 = var58;
																var58 = lb.T;
															}
															
															var60.a(var56, var49 - -3, var29, 0, -1);
															var29 += var60.bb - -1;
														} while (var58.a(false) > 0);
													}
												}
												
												if (var11.Ac == 9) {
													label977:
													{
														if (var11.wb == 1) {
															oi.b(var13, var14, var11.L + var13, var11.w + var14, var11.N);
															if (var41 == 0) {
																break label977;
															}
														}
														
														var22 = var11.L < 0 ? -var11.L : var11.L;
														var24 = var22;
														var23 = var11.w >= 0 ? var11.w : -var11.w;
														if (var22 < var23) {
															var24 = var23;
														}
														
														if (~var24 != -1) {
															var25 = (var11.L << 16) / var24;
															var26 = (var11.w << 16) / var24;
															if (~var25 > ~var26) {
																var26 = -var26;
																if (var41 != 0) {
																	var25 = -var25;
																}
															} else {
																var25 = -var25;
															}
															
															var29 = var11.wb * var25 >> 17;
															int var61 = var13 + -var2;
															var51 = var11.wb * var26 - -1 >> 17;
															var49 = var26 * var11.wb >> 17;
															var32 = -var9 + var14;
															var59 = var11.wb * var25 - -1 >> 17;
															var33 = var49 + var61;
															int var35 = var61 + var11.L - var51;
															int var37 = var29 + var32;
															int var39 = var11.w + var32 + -var59;
															int var36 = var49 + (var61 - -var11.L);
															int var38 = var32 - var59;
															int var40 = var11.w + var32 + var29;
															var34 = var61 + -var51;
															ec.b(var33, var34, var35);
															ec.a(var37, var38, var39, var33, var34, var35, var11.N);
															ec.b(var33, var35, var36);
															ec.a(var37, var39, var40, var33, var35, var36, var11.N);
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					
					++var10;
				} while (~var5.length < ~var10);
				
			}
		} catch (RuntimeException var42) {
			throw bc.a(var42, "ja.M(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}
	
	private File b(int var1) {
		try {
			if (var1 != -1) {
				u = -33;
			}
			
			++anInt_e;
			return this.x.a((byte) 99);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ja.L(" + var1 + ')');
		}
	}
	
	static void c(byte var0) {
		try {
			int var1 = 59 / ((var0 - -13) / 53);
			af.D.b((int) 9946);
			++t;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ja.E(" + var0 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2) {
		pd var3 = nb.oc[var0][var1][var2];
		if (var3 != null) {
			var3.r = null;
		}
	}
	
	static void a(long var0, int var2) {
		int var5 = client.anInt_wb;
		
		try {
			++E;
			if (var2 != 113) {
				a(-40L, -58);
			}
			
			if (~var0 != -1L) {
				int var3 = 0;
				if (var5 != 0 || ii.o > var3) {
					while (~var0 != ~nb.hc[var3]) {
						++var3;
						if (ii.o <= var3) {
							return;
						}
					}
					
					--ii.o;
					int var4 = var3;
					if (var5 == 0 && ~var3 <= ~ii.o) {
						++jc.hb;
						a.k = re.D;
						af.P.p(138, 12885);
						af.P.writeLong(var2 + -227, var0);
					} else {
						do {
							si.V[var4] = si.V[var4 + 1];
							kd.W[var4] = kd.W[var4 + 1];
							cd.n[var4] = cd.n[var4 + 1];
							nb.hc[var4] = nb.hc[var4 + 1];
							ud.gc[var4] = ud.gc[1 + var4];
							++var4;
						} while (~var4 > ~ii.o);
						
						++jc.hb;
						a.k = re.D;
						af.P.p(138, 12885);
						af.P.writeLong(var2 + -227, var0);
					}
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ja.D(" + var0 + ',' + var2 + ')');
		}
	}
	
	final void a(byte var1, long pos) throws IOException {
		try {
			if (var1 != 14) {
				a((ob) null, -20);
			}
			
			++A;
			if (pos < 0L) {
				throw new IOException("Invalid seek to " + pos + " in file " + this.b(var1 ^ -15));
			} else {
				this.G = pos;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ja.C(" + var1 + ',' + pos + ')');
		}
	}
	
	final long c(int var1) {
		try {
			if (var1 < 110) {
				return -36L;
			} else {
				++m;
				return this.F;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "ja.K(" + var1 + ')');
		}
	}
	
	static void d(byte var0) {//TODO:
		int dummy = client.anInt_wb;
		
		try {
			++n;
			le.X = false;
			ed.anInt_g = 0;
			af.P.pointer = 0;
			sh.packetSize = 0;
			rd.O = -1;
			kg.a = 0;
			pg.packetBuffer.pointer = 0;
			wg.db = 0;
			se.e = 0;
			ff.ab = -1;
			tg.q = -1;
			si.S = 0;
			gf.F = -1;
			if (var0 != 0) {
				titlebox = null;
			}
						
			for (int index = 0; index < lg.j.length; ++index) {
				if (lg.j[index] != null) {
					lg.j[index].Mb = -1;
				}
			}
			
			int var2 = 0;
			if (/*dummy != 0 ||*/ ~var2 > ~ai.M.length) {
				do {
					if (ai.M[var2] != null) {
						ai.M[var2].Mb = -1;
					}
					
					++var2;
				} while (~var2 > ~ai.M.length);
			}
			
			sh.c(32);
			pg.setGameState(30, (byte) -120);
			
			for (int index = 0; index < 100; index++) {
				ob.bb[index] = true;
			}
			
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ja.B(" + var0 + ')');
		}
	}
	
	private void e(byte var1) throws IOException {
		int var5 = client.anInt_wb;
		
		try {
			++v;
			int var2 = -102 / ((29 - var1) / 60);
			this.anInt_h = 0;
			if (~this.f != ~this.G) {
				this.x.a((byte) 120, this.G);
				this.f = this.G;
			}
			
			this.k = this.G;
			if (var5 != 0 || this.anInt_h < this.bytes_a.length) {
				do {
					int var3 = -this.anInt_h + this.bytes_a.length;
					if (var3 > 200000000) {
						var3 = 200000000;
					}
					
					int var4 = this.x.a(this.bytes_a, this.anInt_h, var3, 0);
					if (~var4 == 0) {
						break;
					}
					
					this.anInt_h += var4;
					this.f += (long) var4;
				} while (this.anInt_h < this.bytes_a.length);
			}
			
		} catch (RuntimeException var6) {
			throw bc.a(var6, "ja.J(" + var1 + ')');
		}
	}
	
	ja(gd var1, int var2, int var3) throws IOException {
		try {
			this.x = var1;
			this.F = this.D = var1.a(0);
			this.G = 0L;
			this.bytes_a = new byte[var2];
			this.bytes_p = new byte[var3];
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ja.<init>(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}
}
