package changepoint;

import tools.AnnotatedRegion;

public class ChangePoint {
	public AnnotatedRegion pos;

	public AnnotatedRegion upstream_region;

	public AnnotatedRegion downstream_region;

	public String[] ids;
	public double[] cov_upstream;
	public double[] cov_downstream;
	
	public ChangePoint(AnnotatedRegion pos, AnnotatedRegion upstream_region, AnnotatedRegion downstream_region, String[] ids, double[] cov_upstream, double[] cov_downstream) {
		this.pos = pos;
		this.upstream_region = upstream_region;
		this.downstream_region = downstream_region;
		this.ids=ids;
		this.cov_upstream = cov_upstream;
		this.cov_downstream = cov_downstream;
	}
	
	
}
