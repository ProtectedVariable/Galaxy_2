package me.soldier.galaxy.renderer;

public class StarColor extends Color {

	public static StarColor[] ColorsByTemp = {
		new StarColor(1.000000, -0.009872, -0.016682),
		new StarColor(1.000000, 0.000672, -0.017383),
		new StarColor(1.000000, 0.011348, -0.017984),
		new StarColor(1.000000, 0.022136, -0.018468),
		new StarColor(1.000000, 0.033018, -0.018821),
		new StarColor(1.000000, 0.043977, -0.019028),
		new StarColor(1.000000, 0.054999, -0.019075),
		new StarColor(1.000000, 0.066070, -0.018950),
		new StarColor(1.000000, 0.077177, -0.018639),
		new StarColor(1.000000, 0.088309, -0.018133),
		new StarColor(1.000000, 0.099455, -0.017421),
		new StarColor(1.000000, 0.110607, -0.016495),
		new StarColor(1.000000, 0.121756, -0.015346),
		new StarColor(1.000000, 0.132894, -0.013967),
		new StarColor(1.000000, 0.144013, -0.012353),
		new StarColor(1.000000, 0.155107, -0.010499),
		new StarColor(1.000000, 0.166171, -0.008401),
		new StarColor(1.000000, 0.177198, -0.006055),
		new StarColor(1.000000, 0.188184, -0.003458),
		new StarColor(1.000000, 0.199125, -0.000610),
		new StarColor(1.000000, 0.210015, 0.002490),
		new StarColor(1.000000, 0.220853, 0.005844),
		new StarColor(1.000000, 0.231633, 0.009450),
		new StarColor(1.000000, 0.242353, 0.013308),
		new StarColor(1.000000, 0.253010, 0.017416),
		new StarColor(1.000000, 0.263601, 0.021773),
		new StarColor(1.000000, 0.274125, 0.026376),
		new StarColor(1.000000, 0.284579, 0.031222),
		new StarColor(1.000000, 0.294962, 0.036309),
		new StarColor(1.000000, 0.305271, 0.041633),
		new StarColor(1.000000, 0.315505, 0.047190),
		new StarColor(1.000000, 0.325662, 0.052977),
		new StarColor(1.000000, 0.335742, 0.058988),
		new StarColor(1.000000, 0.345744, 0.065221),
		new StarColor(1.000000, 0.355666, 0.071671),
		new StarColor(1.000000, 0.365508, 0.078332),
		new StarColor(1.000000, 0.375269, 0.085200),
		new StarColor(1.000000, 0.384948, 0.092271),
		new StarColor(1.000000, 0.394544, 0.099539),
		new StarColor(1.000000, 0.404059, 0.106999),
		new StarColor(1.000000, 0.413490, 0.114646),
		new StarColor(1.000000, 0.422838, 0.122476),
		new StarColor(1.000000, 0.432103, 0.130482),
		new StarColor(1.000000, 0.441284, 0.138661),
		new StarColor(1.000000, 0.450381, 0.147005),
		new StarColor(1.000000, 0.459395, 0.155512),
		new StarColor(1.000000, 0.468325, 0.164175),
		new StarColor(1.000000, 0.477172, 0.172989),
		new StarColor(1.000000, 0.485935, 0.181949),
		new StarColor(1.000000, 0.494614, 0.191050),
		new StarColor(1.000000, 0.503211, 0.200288),
		new StarColor(1.000000, 0.511724, 0.209657),
		new StarColor(1.000000, 0.520155, 0.219152),
		new StarColor(1.000000, 0.528504, 0.228769),
		new StarColor(1.000000, 0.536771, 0.238502),
		new StarColor(1.000000, 0.544955, 0.248347),
		new StarColor(1.000000, 0.553059, 0.258300),
		new StarColor(1.000000, 0.561082, 0.268356),
		new StarColor(1.000000, 0.569024, 0.278510),
		new StarColor(1.000000, 0.576886, 0.288758),
		new StarColor(1.000000, 0.584668, 0.299095),
		new StarColor(1.000000, 0.592372, 0.309518),
		new StarColor(1.000000, 0.599996, 0.320022),
		new StarColor(1.000000, 0.607543, 0.330603),
		new StarColor(1.000000, 0.615012, 0.341257),
		new StarColor(1.000000, 0.622403, 0.351980),
		new StarColor(1.000000, 0.629719, 0.362768),
		new StarColor(1.000000, 0.636958, 0.373617),
		new StarColor(1.000000, 0.644122, 0.384524),
		new StarColor(1.000000, 0.651210, 0.395486),
		new StarColor(1.000000, 0.658225, 0.406497),
		new StarColor(1.000000, 0.665166, 0.417556),
		new StarColor(1.000000, 0.672034, 0.428659),
		new StarColor(1.000000, 0.678829, 0.439802),
		new StarColor(1.000000, 0.685552, 0.450982),
		new StarColor(1.000000, 0.692204, 0.462196),
		new StarColor(1.000000, 0.698786, 0.473441),
		new StarColor(1.000000, 0.705297, 0.484714),
		new StarColor(1.000000, 0.711739, 0.496013),
		new StarColor(1.000000, 0.718112, 0.507333),
		new StarColor(1.000000, 0.724417, 0.518673),
		new StarColor(1.000000, 0.730654, 0.530030),
		new StarColor(1.000000, 0.736825, 0.541402),
		new StarColor(1.000000, 0.742929, 0.552784),
		new StarColor(1.000000, 0.748968, 0.564177),
		new StarColor(1.000000, 0.754941, 0.575576),
		new StarColor(1.000000, 0.760851, 0.586979),
		new StarColor(1.000000, 0.766696, 0.598385),
		new StarColor(1.000000, 0.772479, 0.609791),
		new StarColor(1.000000, 0.778199, 0.621195),
		new StarColor(1.000000, 0.783858, 0.632595),
		new StarColor(1.000000, 0.789455, 0.643989),
		new StarColor(1.000000, 0.794991, 0.655375),
		new StarColor(1.000000, 0.800468, 0.666751),
		new StarColor(1.000000, 0.805886, 0.678116),
		new StarColor(1.000000, 0.811245, 0.689467),
		new StarColor(1.000000, 0.816546, 0.700803),
		new StarColor(1.000000, 0.821790, 0.712122),
		new StarColor(1.000000, 0.826976, 0.723423),
		new StarColor(1.000000, 0.832107, 0.734704),
		new StarColor(1.000000, 0.837183, 0.745964),
		new StarColor(1.000000, 0.842203, 0.757201),
		new StarColor(1.000000, 0.847169, 0.768414),
		new StarColor(1.000000, 0.852082, 0.779601),
		new StarColor(1.000000, 0.856941, 0.790762),
		new StarColor(1.000000, 0.861748, 0.801895),
		new StarColor(1.000000, 0.866503, 0.812999),
		new StarColor(1.000000, 0.871207, 0.824073),
		new StarColor(1.000000, 0.875860, 0.835115),
		new StarColor(1.000000, 0.880463, 0.846125),
		new StarColor(1.000000, 0.885017, 0.857102),
		new StarColor(1.000000, 0.889521, 0.868044),
		new StarColor(1.000000, 0.893977, 0.878951),
		new StarColor(1.000000, 0.898386, 0.889822),
		new StarColor(1.000000, 0.902747, 0.900657),
		new StarColor(1.000000, 0.907061, 0.911453),
		new StarColor(1.000000, 0.911330, 0.922211),
		new StarColor(1.000000, 0.915552, 0.932929),
		new StarColor(1.000000, 0.919730, 0.943608),
		new StarColor(1.000000, 0.923863, 0.954246),
		new StarColor(1.000000, 0.927952, 0.964842),
		new StarColor(1.000000, 0.931998, 0.975397),
		new StarColor(1.000000, 0.936001, 0.985909),
		new StarColor(1.000000, 0.939961, 0.996379),
		new StarColor(0.993241, 0.937500, 1.000000),
		new StarColor(0.983104, 0.931743, 1.000000),
		new StarColor(0.973213, 0.926103, 1.000000),
		new StarColor(0.963562, 0.920576, 1.000000),
		new StarColor(0.954141, 0.915159, 1.000000),
		new StarColor(0.944943, 0.909849, 1.000000),
		new StarColor(0.935961, 0.904643, 1.000000),
		new StarColor(0.927189, 0.899538, 1.000000),
		new StarColor(0.918618, 0.894531, 1.000000),
		new StarColor(0.910244, 0.889620, 1.000000),
		new StarColor(0.902059, 0.884801, 1.000000),
		new StarColor(0.894058, 0.880074, 1.000000),
		new StarColor(0.886236, 0.875434, 1.000000),
		new StarColor(0.878586, 0.870880, 1.000000),
		new StarColor(0.871103, 0.866410, 1.000000),
		new StarColor(0.863783, 0.862021, 1.000000),
		new StarColor(0.856621, 0.857712, 1.000000),
		new StarColor(0.849611, 0.853479, 1.000000),
		new StarColor(0.842750, 0.849322, 1.000000),
		new StarColor(0.836033, 0.845239, 1.000000),
		new StarColor(0.829456, 0.841227, 1.000000),
		new StarColor(0.823014, 0.837284, 1.000000),
		new StarColor(0.816705, 0.833410, 1.000000),
		new StarColor(0.810524, 0.829603, 1.000000),
		new StarColor(0.804468, 0.825860, 1.000000),
		new StarColor(0.798533, 0.822180, 1.000000),
		new StarColor(0.792715, 0.818562, 1.000000),
		new StarColor(0.787012, 0.815004, 1.000000),
		new StarColor(0.781421, 0.811505, 1.000000),
		new StarColor(0.775938, 0.808063, 1.000000),
		new StarColor(0.770561, 0.804678, 1.000000),
		new StarColor(0.765287, 0.801348, 1.000000),
		new StarColor(0.760112, 0.798071, 1.000000),
		new StarColor(0.755035, 0.794846, 1.000000),
		new StarColor(0.750053, 0.791672, 1.000000),
		new StarColor(0.745164, 0.788549, 1.000000),
		new StarColor(0.740364, 0.785475, 1.000000),
		new StarColor(0.735652, 0.782448, 1.000000),
		new StarColor(0.731026, 0.779468, 1.000000),
		new StarColor(0.726482, 0.776534, 1.000000),
		new StarColor(0.722021, 0.773644, 1.000000),
		new StarColor(0.717638, 0.770798, 1.000000),
		new StarColor(0.713333, 0.767996, 1.000000),
		new StarColor(0.709103, 0.765235, 1.000000),
		new StarColor(0.704947, 0.762515, 1.000000),
		new StarColor(0.700862, 0.759835, 1.000000),
		new StarColor(0.696848, 0.757195, 1.000000),
		new StarColor(0.692902, 0.754593, 1.000000),
		new StarColor(0.689023, 0.752029, 1.000000),
		new StarColor(0.685209, 0.749502, 1.000000),
		new StarColor(0.681458, 0.747011, 1.000000),
		new StarColor(0.677770, 0.744555, 1.000000),
		new StarColor(0.674143, 0.742134, 1.000000),
		new StarColor(0.670574, 0.739747, 1.000000),
		new StarColor(0.667064, 0.737394, 1.000000),
		new StarColor(0.663611, 0.735073, 1.000000),
		new StarColor(0.660213, 0.732785, 1.000000),
		new StarColor(0.656869, 0.730528, 1.000000),
		new StarColor(0.653579, 0.728301, 1.000000),
		new StarColor(0.650340, 0.726105, 1.000000),
		new StarColor(0.647151, 0.723939, 1.000000),
		new StarColor(0.644012, 0.721801, 1.000000),
		new StarColor(0.640922, 0.719692, 1.000000),
		new StarColor(0.637879, 0.717611, 1.000000),
		new StarColor(0.634883, 0.715558, 1.000000),
		new StarColor(0.631932, 0.713531, 1.000000),
		new StarColor(0.629025, 0.711531, 1.000000),
		new StarColor(0.626162, 0.709557, 1.000000),
		new StarColor(0.623342, 0.707609, 1.000000),
		new StarColor(0.620563, 0.705685, 1.000000),
		new StarColor(0.617825, 0.703786, 1.000000),
		new StarColor(0.615127, 0.701911, 1.000000),
		new StarColor(0.612469, 0.700060, 1.000000),
		new StarColor(0.609849, 0.698231, 1.000000),
		new StarColor(0.607266, 0.696426, 1.000000),
		new StarColor(0.604720, 0.694643, 1.000000)
	};
	
	public StarColor(double r, double g, double b) {
		super((float)r, (float)g, (float)b, 1);
	}

}