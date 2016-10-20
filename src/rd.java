final class rd extends rg {
	
	static int D;
	static int E;
	static int F;
	static int G;
	int H = 0;
	static int I;
	static md J = new md(8);
	static vc K;
	static ob L;
	private static ob M = rf.a(40, "Ok");
	static vc N;
	static int O;
	static int P;
	static ob Q;
	static ob runes;
	
	static void a(ca class_ca, int clientScriptId, qe class_qe, int var3) {
		try {
			++I;
			qc var4 = new qc();
			var4.clientScriptId = (long) clientScriptId;
			var4.t = 1;
			var4.x = class_ca;
			var4.o = class_qe;
			synchronized (l.pi_c) {
				l.pi_c.a(0, var4);
			}

			rg.d(-9748);
		} catch (RuntimeException var9) {
			throw bc.a(var9, "rd.C(" + (class_ca != null ? "{...}" : "null") + ',' + clientScriptId + ',' + (class_qe != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}
	
	public static void f(int var0) {
		try {
			J = null;
			M = null;
			if (var0 != 0) {
				J = null;
			}
			
			Q = null;
			N = null;
			runes = null;
			L = null;
			K = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "rd.E(" + var0 + ')');
		}
	}
	
	private void a(int var1, int var2, og var3) {
		try {
			if (var2 != 8) {
				Q = null;
			}
			
			if (~var1 == -6) {
				this.H = var3.readShort(39);
			}
			
			++G;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "rd.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	static int b(int id, byte var1) {
		try {
			if (var1 != 104) {
				return 32;
			} else {
				++D;
				return id >>> 7;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "rd.D(" + id + ',' + var1 + ')');
		}
	}
	
	final void a(boolean var1, og var2) {
		int var4 = client.anInt_wb;
		
		try {
			if (!var1) {
				this.a(10, -111, null);
			}
			
			++E;
			
			do {
				int var3 = var2.readUnsignedByte(255);
				if (~var3 == -1) {
					break;
				}
				
				this.a(var3, 8, var2);
			} while (var4 == 0);
			
		} catch (RuntimeException var5) {
			throw bc.a(var5, "rd.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		L = M;
		K = new vc(64);
		N = new vc(50);
		O = 0;
		P = 1;
		Q = rf.a(40, "Zu viele Verbindungen von Ihrer Adresse)3");
		runes = rf.a(40, "runes");
	}
}
