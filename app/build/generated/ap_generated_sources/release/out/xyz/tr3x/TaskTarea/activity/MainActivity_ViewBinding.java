// Generated code from Butter Knife. Do not modify!
package xyz.tr3x.TaskTarea.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import xyz.tr3x.TaskTarea.R;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.taskRecycler = Utils.findRequiredViewAsType(source, R.id.taskRecycler, "field 'taskRecycler'", RecyclerView.class);
    target.addTask = Utils.findRequiredViewAsType(source, R.id.addTask, "field 'addTask'", TextView.class);
    target.noDataImage = Utils.findRequiredViewAsType(source, R.id.noDataImage, "field 'noDataImage'", ImageView.class);
    target.calendar = Utils.findRequiredViewAsType(source, R.id.calendar, "field 'calendar'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.taskRecycler = null;
    target.addTask = null;
    target.noDataImage = null;
    target.calendar = null;
  }
}
