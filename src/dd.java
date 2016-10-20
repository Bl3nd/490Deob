final class dd {
	
	static int a = 0;
	static ob b = rf.a(40, " <col=ffffff>");
	static ob c;
	static int d;
	static int e;
	static ob f = rf.a(40, "Registrierter Benutzer");
	static ob ob_g;
	static ob membersObject2;
	static int i = 1;
	static int j = 0;
	private static ob membersObject = rf.a(40, "Members object");
	private static ob l;
	static int m;
	
	static void a(ud var0, int var1) {
		try {
			++d;
			int var2 = var0.eb - bi.f;
			int var3 = 128 * var0.Tb - -(var0.Gb * 64);
			int var4 = 128 * var0.W + var0.Gb * 64;
			var0.coordY += (-var0.coordY + var4) / var2;
			var0.coordX += (-var0.coordX + var3) / var2;
			if (var1 != 776) {
				membersObject = null;
			}
			
			var0.rb = 0;
			if (var0.ib == 0) {
				var0.U = 1024;
			}
			
			if (var0.ib == 1) {
				var0.U = 1536;
			}
			
			if (var0.ib == 2) {
				var0.U = 0;
			}
			
			if (var0.ib == 3) {
				var0.U = 512;
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "dd.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	public static void a(int var0) {
		try {
			c = null;
			if (var0 == -7607) {
				membersObject2 = null;
				membersObject = null;
				l = null;
				ob_g = null;
				f = null;
				b = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "dd.C(" + var0 + ')');
		}
	}
	
	static void b(int var0) {
		try {
			++e;
			if (g.O) {
				ra var1 = ue.a(mi.S, (byte) 56, pi.k);
				if (var1 != null && var1.Db != null) {
					wc var2 = new wc();
					var2.E = var1;
					var2.P = var1.Db;
					wg.a(-113, var2);
				}
				
				g.O = false;
				dg.a(var1, -105);
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "dd.A(" + var0 + ')');
		}
	}
	
	static {
		membersObject2 = membersObject;
		l = rf.a(40, "Please wait 1 minute and try again)3");
		ob_g = l;
		c = l;
	}
}
